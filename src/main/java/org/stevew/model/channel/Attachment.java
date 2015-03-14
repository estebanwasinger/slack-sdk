
package org.stevew.model.channel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Attachment {

    @SerializedName("service_name")
    @Expose
    private String serviceName;
    @Expose
    private String title;
    @SerializedName("title_link")
    @Expose
    private String titleLink;
    @Expose
    private String text;
    @Expose
    private String fallback;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("from_url")
    @Expose
    private String fromUrl;
    @SerializedName("image_width")
    @Expose
    private Integer imageWidth;
    @SerializedName("image_height")
    @Expose
    private Integer imageHeight;
    @SerializedName("image_bytes")
    @Expose
    private Integer imageBytes;
    @Expose
    private Integer id;

    /**
     *
     * @return
     *     The serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     *
     * @param serviceName
     *     The service_name
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     *
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The titleLink
     */
    public String getTitleLink() {
        return titleLink;
    }

    /**
     *
     * @param titleLink
     *     The title_link
     */
    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    /**
     *
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     *     The fallback
     */
    public String getFallback() {
        return fallback;
    }

    /**
     *
     * @param fallback
     *     The fallback
     */
    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    /**
     *
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     *     The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     *     The fromUrl
     */
    public String getFromUrl() {
        return fromUrl;
    }

    /**
     *
     * @param fromUrl
     *     The from_url
     */
    public void setFromUrl(String fromUrl) {
        this.fromUrl = fromUrl;
    }

    /**
     *
     * @return
     *     The imageWidth
     */
    public Integer getImageWidth() {
        return imageWidth;
    }

    /**
     *
     * @param imageWidth
     *     The image_width
     */
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     *
     * @return
     *     The imageHeight
     */
    public Integer getImageHeight() {
        return imageHeight;
    }

    /**
     *
     * @param imageHeight
     *     The image_height
     */
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     *
     * @return
     *     The imageBytes
     */
    public Integer getImageBytes() {
        return imageBytes;
    }

    /**
     *
     * @param imageBytes
     *     The image_bytes
     */
    public void setImageBytes(Integer imageBytes) {
        this.imageBytes = imageBytes;
    }

    /**
     *
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

}
