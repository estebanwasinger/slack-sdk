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

    public String getIsUltraRestricted() {
        return is_ultra_restricted;
    }

    public void setIsUltraRestricted(String is_ultra_restricted) {
        this.is_ultra_restricted = is_ultra_restricted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHasFiles() {
        return has_files;
    }

    public void setHasFiles(String has_files) {
        this.has_files = has_files;
    }

    public String getIsOwner() {
        return is_owner;
    }

    public void setIsOwner(String is_owner) {
        this.is_owner = is_owner;
    }

    public String getIsAdmin() {
        return is_admin;
    }

    public void setIsAdmin(String is_admin) {
        this.is_admin = is_admin;
    }

    public String getIsPrimaryOwner() {
        return is_primary_owner;
    }

    public void setIsPrimaryOwner(String is_primary_owner) {
        this.is_primary_owner = is_primary_owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsRestricted() {
        return is_restricted;
    }

    public void setIsRestricted(String is_restricted) {
        this.is_restricted = is_restricted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
