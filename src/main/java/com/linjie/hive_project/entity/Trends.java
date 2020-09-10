package com.linjie.hive_project.entity;

public class Trends {
    private String datetime;
    private String value;

    public Trends(String datetime, String value) {
        this.datetime = datetime;
        this.value = value;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
