package org.stevew.model.chat.attachment;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Field {

    @Expose
    private String title;
    @Expose
    private String value;
    @SerializedName("short")
    @Expose
    private Boolean _short;

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
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @return
     *     The _short
     */
    public Boolean getShort() {
        return _short;
    }

    /**
     *
     * @param _short
     *     The short
     */
    public void setShort(Boolean _short) {
        this._short = _short;
    }

}
