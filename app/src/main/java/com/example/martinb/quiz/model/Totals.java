
package com.example.martinb.quiz.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Totals {

    @SerializedName("matches_played")
    @Expose
    private Integer matchesPlayed;
    @SerializedName("substituted_in")
    @Expose
    private Integer substitutedIn;
    @SerializedName("substituted_out")
    @Expose
    private Integer substitutedOut;
    @SerializedName("goals_scored")
    @Expose
    private Integer goalsScored;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("own_goals")
    @Expose
    private Integer ownGoals;
    @SerializedName("yellow_cards")
    @Expose
    private Integer yellowCards;
    @SerializedName("yellow_red_cards")
    @Expose
    private Integer yellowRedCards;
    @SerializedName("red_cards")
    @Expose
    private Integer redCards;
    @SerializedName("last_event_time")
    @Expose
    private String lastEventTime;

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getSubstitutedIn() {
        return substitutedIn;
    }

    public void setSubstitutedIn(Integer substitutedIn) {
        this.substitutedIn = substitutedIn;
    }

    public Integer getSubstitutedOut() {
        return substitutedOut;
    }

    public void setSubstitutedOut(Integer substitutedOut) {
        this.substitutedOut = substitutedOut;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getOwnGoals() {
        return ownGoals;
    }

    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getYellowRedCards() {
        return yellowRedCards;
    }

    public void setYellowRedCards(Integer yellowRedCards) {
        this.yellowRedCards = yellowRedCards;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public String getLastEventTime() {
        return lastEventTime;
    }

    public void setLastEventTime(String lastEventTime) {
        this.lastEventTime = lastEventTime;
    }

}
