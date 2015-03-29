package org.stevew.model.chat.attachment;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ChatAttachment {

    @Expose
    private String fallback;
    @Expose
    private String color;
    @Expose
    private String pretext;
    @SerializedName("author_name")
    @Expose
    private String authorName;
    @SerializedName("author_link")
    @Expose
    private String authorLink;
    @SerializedName("author_icon")
    @Expose
    private String authorIcon;
    @Expose
    private String title;
    @SerializedName("title_link")
    @Expose
    private String titleLink;
    @Expose
    private String text;
    @Expose
    private List<Field> fields = new ArrayList<Field>();
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    /**
     * @return The fallback
     */
    public String getFallback() {
        return fallback;
    }

    /**
     * @param fallback The fallback
     */
    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    /**
     * @return The color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return The pretext
     */
    public String getPretext() {
        return pretext;
    }

    /**
     * @param pretext The pretext
     */
    public void setPretext(String pretext) {
        this.pretext = pretext;
    }

    /**
     * @return The authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @param authorName The author_name
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * @return The authorLink
     */
    public String getAuthorLink() {
        return authorLink;
    }

    /**
     * @param authorLink The author_link
     */
    public void setAuthorLink(String authorLink) {
        this.authorLink = authorLink;
    }

    /**
     * @return The authorIcon
     */
    public String getAuthorIcon() {
        return authorIcon;
    }

    /**
     * @param authorIcon The author_icon
     */
    public void setAuthorIcon(String authorIcon) {
        this.authorIcon = authorIcon;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The titleLink
     */
    public String getTitleLink() {
        return titleLink;
    }

    /**
     * @param titleLink The title_link
     */
    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The fields
     */
    public List<Field> getFields() {
        return fields;
    }

    /**
     * @param fields The fields
     */
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    /**
     * @return The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
