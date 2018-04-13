
package com.example.martinb.quiz.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Season {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("statistics")
    @Expose
    private Statistics_ statistics;
    @SerializedName("team")
    @Expose
    private Team__ team;
    @SerializedName("tournament")
    @Expose
    private Tournament tournament;
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

    public Statistics_ getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics_ statistics) {
        this.statistics = statistics;
    }

    public Team__ getTeam() {
        return team;
    }

    public void setTeam(Team__ team) {
        this.team = team;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public SeasonCoverageInfo getSeasonCoverageInfo() {
        return seasonCoverageInfo;
    }

    public void setSeasonCoverageInfo(SeasonCoverageInfo seasonCoverageInfo) {
        this.seasonCoverageInfo = seasonCoverageInfo;
    }

}
