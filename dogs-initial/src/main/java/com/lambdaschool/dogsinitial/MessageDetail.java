package com.lambdaschool.dogsinitial;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class MessageDetail implements Serializable {
    private String text;
    private LocalDate date;
    private LocalTime time;

    public MessageDetail() {
    }

    public MessageDetail(String text) {
        this.text = text;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MessageDetail{" +
                "text='" + text + '\'' +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}

