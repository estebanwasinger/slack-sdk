
package org.stevew.model.group;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Group {

    @Expose
    private String id;
    @Expose
    private String name;
    @SerializedName("is_group")
    @Expose
    private Boolean isGroup;
    @Expose
    private Integer created;
    @Expose
    private String creator;
    @SerializedName("is_archived")
    @Expose
    private Boolean isArchived;
    @Expose
    private List<String> members = new ArrayList<String>();
    @Expose
    private Topic topic;
    @Expose
    private Purpose purpose;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The isGroup
     */
    public Boolean getIsGroup() {
        return isGroup;
    }

    /**
     * @param isGroup The is_group
     */
    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    /**
     * @return The created
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * @param created The created
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * @return The creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator The creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return The isArchived
     */
    public Boolean getIsArchived() {
        return isArchived;
    }

    /**
     * @param isArchived The is_archived
     */
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * @return The members
     */
    public List<String> getMembers() {
        return members;
    }

    /**
     * @param members The members
     */
    public void setMembers(List<String> members) {
        this.members = members;
    }

    /**
     * @return The topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     * @param topic The topic
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    /**
     * @return The purpose
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     * @param purpose The purpose
     */
    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

}
