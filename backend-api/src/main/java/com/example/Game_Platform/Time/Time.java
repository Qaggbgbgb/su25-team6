package com.example.Game_Platform.Time;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Time {

    private String dateTime;
    private String timeZone;
    private int hour;
    private int minutes;
    private int sec;


    public Time() {
        
    }
    public String getDateTime() {
        return dateTime;
    }

    public Time(String dateTime, String timeZone, int hour, int minutes, int sec) {
        this.dateTime = dateTime;
        this.timeZone = timeZone;
        this.hour = hour;
        this.sec = sec;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minutes;
    }

    public void setMinute(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return sec;
    }

    public void setSeconds(int sec) {
        this.sec = sec;
    }

}
