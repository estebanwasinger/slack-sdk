
package org.stevew.model.channel;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Channel {

    @Expose
    private String id;
    @Expose
    private String name;
    @SerializedName("is_channel")
    @Expose
    private Boolean isChannel;
    @Expose
    private Integer created;
    @Expose
    private String creator;
    @SerializedName("is_archived")
    @Expose
    private Boolean isArchived;
    @SerializedName("is_general")
    @Expose
    private Boolean isGeneral;
    @SerializedName("is_member")
    @Expose
    private Boolean isMember;
    @SerializedName("last_read")
    @Expose
    private String lastRead;
    @Expose
    private Latest latest;
    @SerializedName("unread_count")
    @Expose
    private Integer unreadCount;
    @SerializedName("unread_count_display")
    @Expose
    private Integer unreadCountDisplay;
    @Expose
    private List<String> members = new ArrayList<String>();
    @Expose
    private Topic topic;
    @Expose
    private Purpose purpose;

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The isChannel
     */
    public Boolean getIsChannel() {
        return isChannel;
    }

    /**
     *
     * @param isChannel
     *     The is_channel
     */
    public void setIsChannel(Boolean isChannel) {
        this.isChannel = isChannel;
    }

    /**
     *
     * @return
     *     The created
     */
    public Integer getCreated() {
        return created;
    }

    /**
     *
     * @param created
     *     The created
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     *
     * @return
     *     The creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     *
     * @param creator
     *     The creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     *
     * @return
     *     The isArchived
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     *
     * @param isArchived
     *     The is_archived
     */
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     *
     * @return
     *     The isGeneral
     */
    public Boolean getIsGeneral() {
        return isGeneral;
    }

    /**
     *
     * @param isGeneral
     *     The is_general
     */
    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
    }

    /**
     *
     * @return
     *     The isMember
     */
    public Boolean getIsMember() {
        return isMember;
    }

    /**
     *
     * @param isMember
     *     The is_member
     */
    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }

    /**
     *
     * @return
     *     The lastRead
     */
    public String getLastRead() {
        return lastRead;
    }

    /**
     *
     * @param lastRead
     *     The last_read
     */
    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }

    /**
     *
     * @return
     *     The latest
     */
    public Latest getLatest() {
        return latest;
    }

    /**
     *
     * @param latest
     *     The latest
     */
    public void setLatest(Latest latest) {
        this.latest = latest;
    }

    /**
     *
     * @return
     *     The unreadCount
     */
    public Integer getUnreadCount() {
        return unreadCount;
    }

    /**
     *
     * @param unreadCount
     *     The unread_count
     */
    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    /**
     *
     * @return
     *     The unreadCountDisplay
     */
    public Integer getUnreadCountDisplay() {
        return unreadCountDisplay;
    }

    /**
     *
     * @param unreadCountDisplay
     *     The unread_count_display
     */
    public void setUnreadCountDisplay(Integer unreadCountDisplay) {
        this.unreadCountDisplay = unreadCountDisplay;
    }

    /**
     *
     * @return
     *     The members
     */
    public List<String> getMembers() {
        return members;
    }

    /**
     *
     * @param members
     *     The members
     */
    public void setMembers(List<String> members) {
        this.members = members;
    }

    /**
     *
     * @return
     *     The topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     *
     * @param topic
     *     The topic
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    /**
     *
     * @return
     *     The purpose
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     *
     * @param purpose
     *     The purpose
     */
    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

}
