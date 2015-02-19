package org.stevew.model.channel;

/**
 * Created by estebanwasinger on 12/7/14.
 */
public class Topic {
    private String value;

    private String lastSet;

    private String creator;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLastSet() {
        return lastSet;
    }

    public void setLastSet(String lastSet) {
        this.lastSet = lastSet;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}