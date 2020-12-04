package com.lamarka.project.stayok.pojo;

import java.io.Serializable;

public class User_daily implements Serializable {
    private int mood;
    private String text;

    public User_daily() {
    }

    public User_daily(int mood, String text) {
        this.mood = mood;
        this.text = text;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "User_daily{" +
                "mood=" + mood +
                ", text='" + text + '\'' +
                '}';
    }
}

