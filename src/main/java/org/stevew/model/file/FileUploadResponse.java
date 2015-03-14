package org.stevew.model.file;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FileUploadResponse {

    @Expose
    private String id;
    @Expose
    private Integer created;
    @Expose
    private Integer timestamp;
    @Expose
    private String name;
    @Expose
    private String title;
    @Expose
    private String mimetype;
    @Expose
    private String filetype;
    @SerializedName("pretty_type")
    @Expose
    private String prettyType;
    @Expose
    private String user;
    @Expose
    private Boolean editable;
    @Expose
    private Integer size;
    @Expose
    private String mode;
    @SerializedName("is_external")
    @Expose
    private Boolean isExternal;
    @SerializedName("external_type")
    @Expose
    private String externalType;
    @SerializedName("is_public")
    @Expose
    private Boolean isPublic;
    @SerializedName("public_url_shared")
    @Expose
    private Boolean publicUrlShared;
    @Expose
    private String url;
    @SerializedName("url_download")
    @Expose
    private String urlDownload;
    @SerializedName("url_private")
    @Expose
    private String urlPrivate;
    @SerializedName("url_private_download")
    @Expose
    private String urlPrivateDownload;
    @Expose
    private String permalink;
    @SerializedName("permalink_public")
    @Expose
    private String permalinkPublic;
    @SerializedName("edit_link")
    @Expose
    private String editLink;
    @Expose
    private String preview;
    @SerializedName("preview_highlight")
    @Expose
    private String previewHighlight;
    @Expose
    private Integer lines;
    @SerializedName("lines_more")
    @Expose
    private Integer linesMore;
    @Expose
    private List<Object> channels = new ArrayList<Object>();
    @Expose
    private List<String> groups = new ArrayList<String>();
    @Expose
    private List<Object> ims = new ArrayList<Object>();
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;

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
     * The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     * The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The mimetype
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     *
     * @param mimetype
     * The mimetype
     */
    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    /**
     *
     * @return
     * The filetype
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     *
     * @param filetype
     * The filetype
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    /**
     *
     * @return
     * The prettyType
     */
    public String getPrettyType() {
        return prettyType;
    }

    /**
     *
     * @param prettyType
     * The pretty_type
     */
    public void setPrettyType(String prettyType) {
        this.prettyType = prettyType;
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
     * The editable
     */
    public Boolean getEditable() {
        return editable;
    }

    /**
     *
     * @param editable
     * The editable
     */
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    /**
     *
     * @return
     * The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The mode
     */
    public String getMode() {
        return mode;
    }

    /**
     *
     * @param mode
     * The mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     *
     * @return
     * The isExternal
     */
    public Boolean getIsExternal() {
        return isExternal;
    }

    /**
     *
     * @param isExternal
     * The is_external
     */
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    /**
     *
     * @return
     * The externalType
     */
    public String getExternalType() {
        return externalType;
    }

    /**
     *
     * @param externalType
     * The external_type
     */
    public void setExternalType(String externalType) {
        this.externalType = externalType;
    }

    /**
     *
     * @return
     * The isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     *
     * @param isPublic
     * The is_public
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     *
     * @return
     * The publicUrlShared
     */
    public Boolean getPublicUrlShared() {
        return publicUrlShared;
    }

    /**
     *
     * @param publicUrlShared
     * The public_url_shared
     */
    public void setPublicUrlShared(Boolean publicUrlShared) {
        this.publicUrlShared = publicUrlShared;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The urlDownload
     */
    public String getUrlDownload() {
        return urlDownload;
    }

    /**
     *
     * @param urlDownload
     * The url_download
     */
    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }

    /**
     *
     * @return
     * The urlPrivate
     */
    public String getUrlPrivate() {
        return urlPrivate;
    }

    /**
     *
     * @param urlPrivate
     * The url_private
     */
    public void setUrlPrivate(String urlPrivate) {
        this.urlPrivate = urlPrivate;
    }

    /**
     *
     * @return
     * The urlPrivateDownload
     */
    public String getUrlPrivateDownload() {
        return urlPrivateDownload;
    }

    /**
     *
     * @param urlPrivateDownload
     * The url_private_download
     */
    public void setUrlPrivateDownload(String urlPrivateDownload) {
        this.urlPrivateDownload = urlPrivateDownload;
    }

    /**
     *
     * @return
     * The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     *
     * @param permalink
     * The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     *
     * @return
     * The permalinkPublic
     */
    public String getPermalinkPublic() {
        return permalinkPublic;
    }

    /**
     *
     * @param permalinkPublic
     * The permalink_public
     */
    public void setPermalinkPublic(String permalinkPublic) {
        this.permalinkPublic = permalinkPublic;
    }

    /**
     *
     * @return
     * The editLink
     */
    public String getEditLink() {
        return editLink;
    }

    /**
     *
     * @param editLink
     * The edit_link
     */
    public void setEditLink(String editLink) {
        this.editLink = editLink;
    }

    /**
     *
     * @return
     * The preview
     */
    public String getPreview() {
        return preview;
    }

    /**
     *
     * @param preview
     * The preview
     */
    public void setPreview(String preview) {
        this.preview = preview;
    }

    /**
     *
     * @return
     * The previewHighlight
     */
    public String getPreviewHighlight() {
        return previewHighlight;
    }

    /**
     *
     * @param previewHighlight
     * The preview_highlight
     */
    public void setPreviewHighlight(String previewHighlight) {
        this.previewHighlight = previewHighlight;
    }

    /**
     *
     * @return
     * The lines
     */
    public Integer getLines() {
        return lines;
    }

    /**
     *
     * @param lines
     * The lines
     */
    public void setLines(Integer lines) {
        this.lines = lines;
    }

    /**
     *
     * @return
     * The linesMore
     */
    public Integer getLinesMore() {
        return linesMore;
    }

    /**
     *
     * @param linesMore
     * The lines_more
     */
    public void setLinesMore(Integer linesMore) {
        this.linesMore = linesMore;
    }

    /**
     *
     * @return
     * The channels
     */
    public List<Object> getChannels() {
        return channels;
    }

    /**
     *
     * @param channels
     * The channels
     */
    public void setChannels(List<Object> channels) {
        this.channels = channels;
    }

    /**
     *
     * @return
     * The groups
     */
    public List<String> getGroups() {
        return groups;
    }

    /**
     *
     * @param groups
     * The groups
     */
    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    /**
     *
     * @return
     * The ims
     */
    public List<Object> getIms() {
        return ims;
    }

    /**
     *
     * @param ims
     * The ims
     */
    public void setIms(List<Object> ims) {
        this.ims = ims;
    }

    /**
     *
     * @return
     * The commentsCount
     */
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     *
     * @param commentsCount
     * The comments_count
     */
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

}