
package org.stevew.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class User {

    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private Boolean deleted;
    @Expose
    private Object status;
    @Expose
    private String color;
    @SerializedName("real_name")
    @Expose
    private String realName;
    @Expose
    private String tz;
    @SerializedName("tz_label")
    @Expose
    private String tzLabel;
    @SerializedName("tz_offset")
    @Expose
    private Integer tzOffset;
    @Expose
    private Profile profile;
    @SerializedName("is_admin")
    @Expose
    private Boolean isAdmin;
    @SerializedName("is_owner")
    @Expose
    private Boolean isOwner;
    @SerializedName("is_primary_owner")
    @Expose
    private Boolean isPrimaryOwner;
    @SerializedName("is_restricted")
    @Expose
    private Boolean isRestricted;
    @SerializedName("is_ultra_restricted")
    @Expose
    private Boolean isUltraRestricted;
    @SerializedName("is_bot")
    @Expose
    private Boolean isBot;
    @SerializedName("has_files")
    @Expose
    private Boolean hasFiles;

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
     *     The deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     *
     * @param deleted
     *     The deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     *
     * @return
     *     The status
     */
    public Object getStatus() {
        return status;
    }

    /**
     *
     * @param status
     *     The status
     */
    public void setStatus(Object status) {
        this.status = status;
    }

    /**
     *
     * @return
     *     The color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     *     The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     *     The realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     *
     * @param realName
     *     The real_name
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     *
     * @return
     *     The tz
     */
    public String getTz() {
        return tz;
    }

    /**
     *
     * @param tz
     *     The tz
     */
    public void setTz(String tz) {
        this.tz = tz;
    }

    /**
     *
     * @return
     *     The tzLabel
     */
    public String getTzLabel() {
        return tzLabel;
    }

    /**
     *
     * @param tzLabel
     *     The tz_label
     */
    public void setTzLabel(String tzLabel) {
        this.tzLabel = tzLabel;
    }

    /**
     *
     * @return
     *     The tzOffset
     */
    public Integer getTzOffset() {
        return tzOffset;
    }

    /**
     *
     * @param tzOffset
     *     The tz_offset
     */
    public void setTzOffset(Integer tzOffset) {
        this.tzOffset = tzOffset;
    }

    /**
     *
     * @return
     *     The profile
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     *
     * @param profile
     *     The profile
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     *
     * @return
     *     The isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     *
     * @param isAdmin
     *     The is_admin
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     *
     * @return
     *     The isOwner
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    /**
     *
     * @param isOwner
     *     The is_owner
     */
    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    /**
     *
     * @return
     *     The isPrimaryOwner
     */
    public Boolean getIsPrimaryOwner() {
        return isPrimaryOwner;
    }

    /**
     *
     * @param isPrimaryOwner
     *     The is_primary_owner
     */
    public void setIsPrimaryOwner(Boolean isPrimaryOwner) {
        this.isPrimaryOwner = isPrimaryOwner;
    }

    /**
     *
     * @return
     *     The isRestricted
     */
    public Boolean getIsRestricted() {
        return isRestricted;
    }

    /**
     *
     * @param isRestricted
     *     The is_restricted
     */
    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    /**
     *
     * @return
     *     The isUltraRestricted
     */
    public Boolean getIsUltraRestricted() {
        return isUltraRestricted;
    }

    /**
     *
     * @param isUltraRestricted
     *     The is_ultra_restricted
     */
    public void setIsUltraRestricted(Boolean isUltraRestricted) {
        this.isUltraRestricted = isUltraRestricted;
    }

    /**
     *
     * @return
     *     The isBot
     */
    public Boolean getIsBot() {
        return isBot;
    }

    /**
     *
     * @param isBot
     *     The is_bot
     */
    public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
    }

    /**
     *
     * @return
     *     The hasFiles
     */
    public Boolean getHasFiles() {
        return hasFiles;
    }

    /**
     *
     * @param hasFiles
     *     The has_files
     */
    public void setHasFiles(Boolean hasFiles) {
        this.hasFiles = hasFiles;
    }

}
