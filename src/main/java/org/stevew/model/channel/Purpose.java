package org.stevew.model.channel;

/**
 * Created by estebanwasinger on 12/7/14.
 */
public class Purpose {
    private String value;

    private String last_set;

    private String creator;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLast_set() {
        return last_set;
    }

    public void setLast_set(String last_set) {
        this.last_set = last_set;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}