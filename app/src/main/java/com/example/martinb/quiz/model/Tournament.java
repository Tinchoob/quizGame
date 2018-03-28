package com.example.martinb.quiz.model;

/**
 * Created by martinb on 3/21/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tournament {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sport")
    @Expose
    private Sport sport;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("current_season")
    @Expose
    private CurrentSeason currentSeason;
    @SerializedName("season_coverage_info")
    @Expose
    private SeasonCoverageInfo seasonCoverageInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    public SeasonCoverageInfo getSeasonCoverageInfo() {
        return seasonCoverageInfo;
    }

    public void setSeasonCoverageInfo(SeasonCoverageInfo seasonCoverageInfo) {
        this.seasonCoverageInfo = seasonCoverageInfo;
    }

}