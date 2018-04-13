
package com.example.martinb.quiz.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("team")
    @Expose
    private Team_ team;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("jersey_number")
    @Expose
    private Integer jerseyNumber;
    @SerializedName("end_date")
    @Expose
    private String endDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Team_ getTeam() {
        return team;
    }

    public void setTeam(Team_ team) {
        this.team = team;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
