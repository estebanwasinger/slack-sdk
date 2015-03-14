
package org.stevew.model.channel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Topic {

    @Expose
    private String value;
    @Expose
    private String creator;
    @SerializedName("last_set")
    @Expose
    private Integer lastSet;

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
     *     The lastSet
     */
    public Integer getLastSet() {
        return lastSet;
    }

    /**
     *
     * @param lastSet
     *     The last_set
     */
    public void setLastSet(Integer lastSet) {
        this.lastSet = lastSet;
    }

}
