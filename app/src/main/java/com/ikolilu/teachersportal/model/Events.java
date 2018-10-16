package com.ikolilu.teachersportal.model;

/**
 * Created by Genuis on 18/09/2018.
 */

public class Events {
    private long id;
    private String theme;
    private String description;
    private String venue;
    private String time;
    private String extraData;

    public Events (long id, String theme, String description, String venue, String time, String extraData)
    {
        this.id = id;
        this.theme = theme;
        this.description = description;
        this.venue = venue;
        this.time = time;
        this.extraData = extraData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }
}
