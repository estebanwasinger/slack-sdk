package org.stevew;

/**
 * Created by estebanwasinger on 12/4/14.
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;
import org.stevew.exceptions.ChannelNotFoundException;
import org.stevew.model.User;
import org.stevew.model.channel.Channel;
import org.stevew.model.channel.Message;
import org.stevew.model.chat.MessageResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SlackClient {

    /*
    This SDK don't support OAuth dance by the moment
     */
    private String token;
    private Gson mapper;

    public SlackClient(String token) {
        this.token = token;
        mapper = new Gson();
    }

    public String testAuth() {

        String output = RestUtils.sendRequest(getURL(Operations.AUTH_TEST));
        return output;
    }

    public Boolean isConnected(){
        String output = RestUtils.sendRequest(getURL(Operations.AUTH_TEST));
        JSONObject slackResponse = new JSONObject(output);
        return slackResponse.getBoolean("ok");
    }

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

    public User getUserInfo(String id) {
        User user;

        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.USER_INFO);
        request.addArgument("user", id);

        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("user");
        user = mapper.fromJson(slackResponse.toString(), User.class);
        return user;
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

    public Channel getChannelById(String id) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_INFO).addArgument("channel", id);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }

    public List<Message> getChannelHistory(String channelId, String latest, String oldest, String count) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_HISTORY);
        request.addArgument("channel", channelId);
        request.addArgument("latest", latest);
        request.addArgument("oldest", oldest);
        request.addArgument("count", count);
        String output = RestUtils.sendRequest(request);

        JSONArray slackResponse = (JSONArray) new JSONObject(output).get("messages");
        Type listType = new TypeToken<ArrayList<Message>>() {
        }.getType();
        System.out.println(listType.toString());
        return mapper.fromJson(slackResponse.toString(), listType);
    }
    
    public Channel createChannel(String channelName){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_CREATE);
        request.addArgument("name",channelName);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }
    
    public Channel renameChannel(String channelId, String newName){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_RENAME);
        request.addArgument("channel",channelId);
        request.addArgument("name",newName);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }

    public MessageResponse sendMessage(String message, String channelId, String username, String iconUrl) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHAT_POSTMESSAGE);
        request.addArgument("channel", channelId);
        request.addArgument("text", message);
        request.addArgument("username", username);
        request.addArgument("icon_url", iconUrl);
        String output = RestUtils.sendRequest(request);
        return mapper.fromJson(output, MessageResponse.class);
    }

    public Boolean leaveChannel(String channelId){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_LEAVE);
        request.addArgument("channel",channelId);
        String output = RestUtils.sendRequest(request);

        return new JSONObject(output).getBoolean("ok");
    }
    
    public String openDirectMessageChannel(String userId){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.IM_OPEN);
        request.addArgument("user", userId);
        String output = RestUtils.sendRequest(request);
        return output;
    }

    public String listDirectMessageChannels(){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.IM_LIST);
        request.enablePretty();
        String output = RestUtils.sendRequest(request);
        return output;
    }

    public Channel joinChannel(String channelName){
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHANNELS_JOIN);
        request.addArgument("name",channelName);
        String output = RestUtils.sendRequest(request);

        JSONObject slackResponse = (JSONObject) new JSONObject(output).get("channel");
        return mapper.fromJson(slackResponse.toString(), Channel.class);
    }

    public String deleteMessage(String timeStamp, String channelId) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHAT_DELETE);
        request.addArgument("channel", channelId);
        request.addArgument("ts", timeStamp);
        return RestUtils.sendRequest(request);
    }

    public String updateMessage(String timeStamp, String channelId, String message) {
        SlackRequest request = createAuthorizedRequest();
        request.setOperation(Operations.CHAT_UPDATE);
        request.addArgument("channel", channelId);
        request.addArgument("text", message);
        request.addArgument("ts", timeStamp);
        return RestUtils.sendRequest(request);
    }

    private String getURL(String operation) {
        return "https://slack.com/api/" + operation + "?token=" + token;
    }
    
    private SlackRequest createAuthorizedRequest(){
        return RestUtils.newRequest(token);
    }
}
