package org.stevew;

/**
 * Created by estebanwasinger on 12/4/14.
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;
import org.stevew.exceptions.ChannelNotFoundException;
import org.stevew.exceptions.UserNotFoundException;
import org.stevew.model.User;
import org.stevew.model.channel.Channel;
import org.stevew.model.chat.Message;
import org.stevew.model.chat.MessageResponse;
import org.stevew.model.chat.attachment.ChatAttachment;
import org.stevew.model.file.FileUploadResponse;
import org.stevew.model.group.Group;
import org.stevew.model.im.DirectMessageChannel;
import org.stevew.model.im.DirectMessageChannelCreationResponse;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SlackClient {

    private String token;
    private Gson mapper;

    public SlackClient(String token) {
        this.token = token;
        mapper = new Gson();
    }

    //******************
    // Auth methods
    //******************

    public String testAuth() {

        String output = RestUtils.sendRequest(getURL(Operations.AUTH_TEST));
        return output;
    }

    public Boolean isConnected() {
        String output = RestUtils.sendRequest(getURL(Operations.AUTH_TEST));
        JSONObject slackResponse = new JSONObject(output);
        return slackResponse.getBoolean("ok");
    }

    //******************
    // Channel methods
    //******************

    public List<Channel> getChannelList() {

        List<Channel> list = new ArrayList<Channel>();
        SlackRequest request = createAuthorizedRequest().setOperation(Operations.CHANNELS_LIST).enablePretty();
        String output = RestUtils.sendRequest(request);
        JSONArray channels = (JSONArray) new JSONObject(output).get("channels");

        for (int i = 0; i < channels.length(); i++) {
            JSONObject channel = (JSONObject) channels.get(i);
            Channel newChannel = mapper.fromJson(channel.toString(), Channel.class);
            list.add(newChannel);
        }
        return list;
    }

    public Boolean leaveChannel(String channelId) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_LEAVE);
        request.addArgument("channel", channelId);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Channel getChannelById(String id) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_INFO).addArgument("channel", id);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }

    public List<Message> getChannelHistory(String channelId, String latest, String oldest, String count) {
        return getMessages(channelId, latest, oldest, count, Operations.CHANNELS_HISTORY);
    }

    public Channel createChannel(String channelName) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_CREATE);
        request.addArgument("name", channelName);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }

    public Channel renameChannel(String channelId, String newName) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_RENAME);
        request.addArgument("channel", channelId);
        request.addArgument("name", newName);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }

    public Channel joinChannel(String channelName) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_JOIN);
        request.addArgument("name", channelName);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }

    public Channel getChannelByName(String name) {
        List<Channel> list = getChannelList();
        for (Channel channel : list) {
            if (channel.getName().equals(name)) {
                return channel;
            }
        }
        throw new ChannelNotFoundException("Channel: " + name + " does not exist.");
    }

    public Boolean setChannelPurpose(String channelID, String purpose) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_SETPURPOSE);
        request.addArgument("channel", channelID);
        request.addArgument("purpose", purpose);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean setChannelTopic(String channelID, String topic) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_SETTOPIC);
        request.addArgument("channel", channelID);
        request.addArgument("topic", topic);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean markViewChannel(String channelID, String timeStamp) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_MARK);
        request.addArgument("channel", channelID);
        request.addArgument("ts", timeStamp);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean kickUserFromChannel(String channelID, String user){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_KICK);
        request.addArgument("channel", channelID);
        request.addArgument("user", user);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean inviteUserToChannel(String channelID, String user){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_INVITE);
        request.addArgument("channel", channelID);
        request.addArgument("user", user);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean unarchiveChannel(String channelID){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_UNARCHIVE);
        request.addArgument("channel", channelID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean archiveChannel(String channelID) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_ARCHIVE);
        request.addArgument("channel", channelID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    //******************
    // User methods
    //******************

    public User getUserInfo(String id) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.USER_INFO);
        request.addArgument("user", id);

        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("user");
        return mapper.fromJson(slackResponse.toString(), User.class);
    }

    public List<User> getUserList() {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.USER_LIST);

        String output = RestUtils.sendRequest(request);

        JSONArray slackResponse = (JSONArray) new JSONObject(output).get("members");
        Type listType = new TypeToken<ArrayList<User>>() {
        }.getType();
        return mapper.fromJson(slackResponse.toString(), listType);
    }

    public User getUserInfoByName(String username) throws UserNotFoundException {
        List<User> list = getUserList();
        for (User user : list) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        throw new UserNotFoundException("The user: " + username + " does not exist, please check the name!");
    }

    //******************
    // Chat methods
    //******************

    public MessageResponse sendMessage(String message, String channelId, String username, String iconUrl, Boolean asUser) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHAT_POSTMESSAGE);
        request.addArgument("channel", channelId);
        request.addArgument("text", message);
        request.addArgument("username", username);
        request.addArgument("icon_url", iconUrl);
        request.addArgument("as_user", String.valueOf(asUser));
        String output = RestUtils.sendRequest(request);
        return mapper.fromJson(output, MessageResponse.class);
    }

    public MessageResponse sendMessageWithAttachment(String message, String channelId, String username, String iconUrl,ChatAttachment chatAttachment, Boolean asUser) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHAT_POSTMESSAGE);
        request.addArgument("channel", channelId);
        request.addArgument("text", message);
        request.addArgument("username", username);
        request.addArgument("icon_url", iconUrl);
        request.addArgument("as_user", String.valueOf(asUser));
        ArrayList<ChatAttachment> chatAttachmentArrayList = new ArrayList<ChatAttachment>();
        chatAttachmentArrayList.add(chatAttachment);
        request.addArgument("attachments",mapper.toJson(chatAttachmentArrayList));
        System.out.println(mapper.toJson(chatAttachmentArrayList));
        String output = RestUtils.sendRequest(request);
        return mapper.fromJson(output, MessageResponse.class);
    }

    public Boolean deleteMessage(String timeStamp, String channelId) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHAT_DELETE);
        request.addArgument("channel", channelId);
        request.addArgument("ts", timeStamp);
        String output = RestUtils.sendRequest(request);
        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean updateMessage(String timeStamp, String channelId, String message) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHAT_UPDATE);
        request.addArgument("channel", channelId);
        request.addArgument("text", message);
        request.addArgument("ts", timeStamp);
        String output = RestUtils.sendRequest(request);
        return new JSONObject(output).getBoolean("ok");
    }

    //******************
    // IM methods
    //******************

    public DirectMessageChannelCreationResponse openDirectMessageChannel(String userId) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.IM_OPEN);
        request.addArgument("user", userId);
        String output = RestUtils.sendRequest(request);
        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), DirectMessageChannelCreationResponse.class);
    }

    public List<DirectMessageChannel> getDirectMessageChannelsList() {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.IM_LIST);
        String output = RestUtils.sendRequest(request);
        JSONArray slackResponse = (JSONArray) new JSONObject(output).get("ims");
        Type listType = new TypeToken<ArrayList<DirectMessageChannel>>() {
        }.getType();
        return mapper.fromJson(slackResponse.toString(), listType);
    }

    public List<Message> getDirectChannelHistory(String channelId, String latest, String oldest, String count) {
        return getMessages(channelId, latest, oldest, count, Operations.IM_HISTORY);
    }

    public Boolean markViewDirectMessageChannel(String channelID, String timeStamp) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.IM_MARK);
        request.addArgument("channel", channelID);
        request.addArgument("ts", timeStamp);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean closeDirectMessageChannel(String channelID) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.IM_CLOSE);
        request.addArgument("channel", channelID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }


    //******************
    // Group methods
    //******************


    public List<Message> getGroupHistory(String channelId, String latest, String oldest, String count) {
        return getMessages(channelId, latest, oldest, count, Operations.GROUPS_HISTORY);
    }

    public List<Group> getGroupList() {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_LIST);
        String output = RestUtils.sendRequest(request);
        JSONArray slackResponse = (JSONArray) new JSONObject(output).get("groups");
        Type listType = new TypeToken<ArrayList<Group>>() {
        }.getType();
        return mapper.fromJson(slackResponse.toString(), listType);
    }

    public Group createGroup(String name) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_CREATE);
        request.addArgument("name", name);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("group");
        return mapper.fromJson(slackResponse.toString(), Group.class);
    }

    public Boolean openGroup(String channelID) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_OPEN);
        request.addArgument("channel", channelID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean leaveGroup(String channelID) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_LEAVE);
        request.addArgument("channel", channelID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean archiveGroup(String channelID) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_ARCHIVE);
        request.addArgument("channel", channelID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean setGroupPurpose(String channelID, String purpose) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_SETPORPUSE);
        request.addArgument("channel", channelID);
        request.addArgument("purpose", purpose);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean setGroupTopic(String channelID, String topic) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_SETTOPIC);
        request.addArgument("channel", channelID);
        request.addArgument("topic", topic);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean closeGroup(String channelID) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_CLOSE);
        request.addArgument("channel", channelID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean markViewGroup(String channelID, String timeStamp) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_MARK);
        request.addArgument("channel", channelID);
        request.addArgument("ts", timeStamp);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean kickUserFromGroup(String channelID, String user){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_KICK);
        request.addArgument("channel", channelID);
        request.addArgument("user", user);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean inviteUserToGroup(String channelID, String user){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_INVITE);
        request.addArgument("channel", channelID);
        request.addArgument("user", user);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Boolean unarchiveGroup(String groupID){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_UNARCHIVE);
        request.addArgument("channel", groupID);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }

    public Channel renameGroup(String channelId, String newName) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.GROUPS_RENAME);
        request.addArgument("channel", channelId);
        request.addArgument("name", newName);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }


    //******************
    // File methods
    //******************
    //TODO -- Delete duplicated code
    public FileUploadResponse sendFile(String channelId, String fileName, String fileType, String title, String initialComment, InputStream file){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.FILES_UPLOAD);
        request.addArgument("channels", channelId);
        request.addArgument("filename", fileName);
        request.addArgument("filetype", fileType);
        request.addArgument("title", title);
        request.addArgument("initial_comment", initialComment);


        String stringResponse = RestUtils.sendAttachmentRequest(request, file);

        return mapper.fromJson(new JSONObject(stringResponse).getJSONObject("file").toString(),FileUploadResponse.class);
    }

    public FileUploadResponse sendFile(String channelId, String fileName, String fileType, String title, String initialComment, String filePath) throws IOException {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.FILES_UPLOAD);
        request.addArgument("channels", channelId);
        request.addArgument("filename", fileName);
        request.addArgument("filetype", fileType);
        request.addArgument("title", title);
        request.addArgument("initial_comment", initialComment);

        File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("File " + file.getAbsolutePath() + " does not exist!");
        }

        String stringResponse = RestUtils.sendAttachmentRequest(request, file);

        return mapper.fromJson(new JSONObject(stringResponse).getJSONObject("file").toString(),FileUploadResponse.class);
    }

    //******************
    // Util methods
    //******************

    public List<Message> getMessages(String channelId, String latest, String oldest, String count, String operation) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(operation);
        request.addArgument("channel", channelId);
        request.addArgument("latest", latest);
        request.addArgument("oldest", oldest);
        request.addArgument("count", count);
        String output = RestUtils.sendRequest(request);
        JSONArray slackResponse = (JSONArray) new JSONObject(output).get("messages");
        Type listType = new TypeToken<ArrayList<Message>>() {
        }.getType();
        return mapper.fromJson(slackResponse.toString(), listType);
    }

    private String getURL(String operation) {
        return "https://slack.com/api/" + operation + "?token=" + token;
    }

    private SlackRequest createAuthorizedRequest() {
        return RestUtils.newRequest(token);
    }
}
