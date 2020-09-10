package com.linjie.hive_project.entity;

import java.util.List;

public class Data {
    private String title;
    private String type;
    private List<Trends> trends;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Trends> getTrends() {
        return trends;
    }

    public void setTrends(List<Trends> trends) {
        this.trends = trends;
    }
}
