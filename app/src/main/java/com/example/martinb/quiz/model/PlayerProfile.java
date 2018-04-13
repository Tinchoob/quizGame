
package com.example.martinb.quiz.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlayerProfile {

    @SerializedName("generated_at")
    @Expose
    private String generatedAt;
    @SerializedName("schema")
    @Expose
    private String schema;
    @SerializedName("player")
    @Expose
    private Player player;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("roles")
    @Expose
    private List<Role> roles = null;
    @SerializedName("statistics")
    @Expose
    private Statistics statistics;

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

}
