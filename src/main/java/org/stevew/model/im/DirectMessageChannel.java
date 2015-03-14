package org.stevew.model.im;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DirectMessageChannel {

    @Expose
    private String id;
    @SerializedName("is_im")
    @Expose
    private Boolean isIm;
    @Expose
    private String user;
    @Expose
    private Integer created;
    @SerializedName("is_user_deleted")
    @Expose
    private Boolean isUserDeleted;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The isIm
     */
    public Boolean getIsIm() {
        return isIm;
    }

    /**
     *
     * @param isIm
     * The is_im
     */
    public void setIsIm(Boolean isIm) {
        this.isIm = isIm;
    }

    /**
     *
     * @return
     * The user
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The created
     */
    public Integer getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The isUserDeleted
     */
    public Boolean getIsUserDeleted() {
        return isUserDeleted;
    }

    /**
     *
     * @param isUserDeleted
     * The is_user_deleted
     */
    public void setIsUserDeleted(Boolean isUserDeleted) {
        this.isUserDeleted = isUserDeleted;
    }

}