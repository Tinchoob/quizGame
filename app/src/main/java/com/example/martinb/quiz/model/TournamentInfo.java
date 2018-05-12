
package com.example.martinb.quiz.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TournamentInfo {

    @SerializedName("generated_at")
    @Expose
    private String generatedAt;
    @SerializedName("schema")
    @Expose
    private String schema;
    @SerializedName("tournament")
    @Expose
    private Tournament tournament;
    @SerializedName("season")
    @Expose
    private Season season;
    @SerializedName("round")
    @Expose
    private Round round;
    @SerializedName("season_coverage_info")
    @Expose
    private SeasonCoverageInfo seasonCoverageInfo;
    @SerializedName("coverage_info")
    @Expose
    private CoverageInfo coverageInfo;
    @SerializedName("groups")
    @Expose
    private List<Group> groups = null;

    public String getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public SeasonCoverageInfo getSeasonCoverageInfo() {
        return seasonCoverageInfo;
    }

    public void setSeasonCoverageInfo(SeasonCoverageInfo seasonCoverageInfo) {
        this.seasonCoverageInfo = seasonCoverageInfo;
    }

    public CoverageInfo getCoverageInfo() {
        return coverageInfo;
    }

    public void setCoverageInfo(CoverageInfo coverageInfo) {
        this.coverageInfo = coverageInfo;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
