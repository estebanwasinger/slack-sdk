package org.stevew.model.im;

/**
 * Created by estebanwasinger on 2/21/15.
 */
public class DirectMessageChannel {
    private String id;

    private String created;

    private String is_im;

    private String user;

    private String is_user_deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getIs_im() {
        return is_im;
    }

    public void setIs_im(String is_im) {
        this.is_im = is_im;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIs_user_deleted() {
        return is_user_deleted;
    }

    public void setIs_user_deleted(String is_user_deleted) {
        this.is_user_deleted = is_user_deleted;
    }
}
