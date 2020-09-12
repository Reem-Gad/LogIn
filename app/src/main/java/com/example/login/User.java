package com.example.login;

public class User {
    private String userName;
    private String userMessage;
    private int userImg;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }

    public User() {
    }

    public User(String userName, String userMessage, int userImg) {
        this.userName = userName;
        this.userMessage = userMessage;
        this.userImg = userImg;
    }

    @Override
    public String toString() {
        return "User Name is:"+userName+"\n Message is:"+userMessage;
    }
}

