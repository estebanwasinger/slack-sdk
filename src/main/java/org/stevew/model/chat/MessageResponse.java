package org.stevew.model.chat;

/**
 * Created by estebanwasinger on 1/30/15.
 */
public class MessageResponse {
    private Message message;

    private String ts;

    private String ok;

    private String channel;

    public Message getMessage ()
    {
        return message;
    }

    public void setMessage (Message message)
    {
        this.message = message;
    }

    public String getTs ()
    {
        return ts;
    }

    public void setTs (String ts)
    {
        this.ts = ts;
    }

    public String getOk ()
    {
        return ok;
    }

    public void setOk (String ok)
    {
        this.ok = ok;
    }

    public String getChannel ()
    {
        return channel;
    }

    public void setChannel (String channel)
    {
        this.channel = channel;
    }
}
