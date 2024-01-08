package com.example.myappswithdb;

public class user {

    String userID, name, profile, email;

    public user(String userID, String name, String profile, String email) {
        this.userID = userID;
        this.name = name;
        this.profile = profile;
        this.email = email;
    }

    public user() {

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {
        this.email = email;
    }


}
