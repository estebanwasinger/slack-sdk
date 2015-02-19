package org.stevew.model.channel;

/**
 * Created by estebanwasinger on 12/4/14.
 */
public class Channel {

    private Topic topic;

    private String id;

    private String is_general;

    private String created;

    private String is_member;

    private String name;

    private Purpose purpose;

    private String num_members;

    private String is_archived;

    private String[] members;

    private String is_channel;

    private String creator;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsGeneral() {
        return is_general;
    }

    public void setIsGeneral(String is_general) {
        this.is_general = is_general;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getIsMember() {
        return is_member;
    }

    public void setIsMember(String is_member) {
        this.is_member = is_member;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public String getNumMembers() {
        return num_members;
    }

    public void setNumMembers(String num_members) {
        this.num_members = num_members;
    }

    public String getIsArchived() {
        return is_archived;
    }

    public void setIsArchived(String is_archived) {
        this.is_archived = is_archived;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    public String getIsChannel() {
        return is_channel;
    }

    public void setIsChannel(String is_channel) {
        this.is_channel = is_channel;
    }

    public String getCreator() {
        return creator;
    }


    public void setCreator(String creator) {
        this.creator = creator;
    }
}