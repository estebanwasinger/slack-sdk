package org.stevew.model.chat;

/**
 * Created by estebanwasinger on 1/30/15.
 */
public class Message {
    private String username;

    private String text;

    private String ts;

    private String subtype;

    private Icons icons;

    private String type;

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getTs ()
    {
        return ts;
    }

    public void setTs (String ts)
    {
        this.ts = ts;
    }

    public String getSubtype ()
    {
        return subtype;
    }

    public void setSubtype (String subtype)
    {
        this.subtype = subtype;
    }

    public Icons getIcons ()
    {
        return icons;
    }

    public void setIcons (Icons icons)
    {
        this.icons = icons;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }
}

