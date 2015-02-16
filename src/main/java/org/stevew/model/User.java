package org.stevew.model;

/**
 * Created by estebanwasinger on 12/4/14.
 */
public class User {
        private String is_ultra_restricted;

        private String id;

        private String has_files;

        private String is_owner;

        private String is_admin;

        private String is_primary_owner;

        private String color;

        private String is_restricted;

        private String name;

        private String deleted;

        private Profile profile;

    public String getIs_ultra_restricted ()
    {
        return is_ultra_restricted;
    }

    public void setIs_ultra_restricted (String is_ultra_restricted)
    {
        this.is_ultra_restricted = is_ultra_restricted;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getHas_files ()
    {
        return has_files;
    }

    public void setHas_files (String has_files)
    {
        this.has_files = has_files;
    }

    public String getIs_owner ()
    {
        return is_owner;
    }

    public void setIs_owner (String is_owner)
    {
        this.is_owner = is_owner;
    }

    public String getIs_admin ()
    {
        return is_admin;
    }

    public void setIs_admin (String is_admin)
    {
        this.is_admin = is_admin;
    }

    public String getIs_primary_owner ()
    {
        return is_primary_owner;
    }

    public void setIs_primary_owner (String is_primary_owner)
    {
        this.is_primary_owner = is_primary_owner;
    }

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getIs_restricted ()
    {
        return is_restricted;
    }

    public void setIs_restricted (String is_restricted)
    {
        this.is_restricted = is_restricted;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDeleted ()
    {
        return deleted;
    }

    public void setDeleted (String deleted)
    {
        this.deleted = deleted;
    }

    public Profile getProfile ()
    {
        return profile;
    }

    public void setProfile (Profile profile)
    {
        this.profile = profile;
    }
}
