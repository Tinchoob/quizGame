package com.example.martinb.quiz.model;

/**
 * Created by martinb on 3/21/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SeasonCoverageInfo {

    @SerializedName("season_id")
    @Expose
    private String seasonId;
    @SerializedName("scheduled")
    @Expose
    private Integer scheduled;
    @SerializedName("played")
    @Expose
    private Integer played;
    @SerializedName("max_coverage_level")
    @Expose
    private String maxCoverageLevel;
    @SerializedName("max_covered")
    @Expose
    private Integer maxCovered;
    @SerializedName("min_coverage_level")
    @Expose
    private String minCoverageLevel;

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getScheduled() {
        return scheduled;
    }

    public void setScheduled(Integer scheduled) {
        this.scheduled = scheduled;
    }

    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public String getMaxCoverageLevel() {
        return maxCoverageLevel;
    }

    public void setMaxCoverageLevel(String maxCoverageLevel) {
        this.maxCoverageLevel = maxCoverageLevel;
    }

    public Integer getMaxCovered() {
        return maxCovered;
    }

    public void setMaxCovered(Integer maxCovered) {
        this.maxCovered = maxCovered;
    }

    public String getMinCoverageLevel() {
        return minCoverageLevel;
    }

    public void setMinCoverageLevel(String minCoverageLevel) {
        this.minCoverageLevel = minCoverageLevel;
    }

}