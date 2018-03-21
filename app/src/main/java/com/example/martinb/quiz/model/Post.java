package com.example.martinb.quiz.model;

/**
 * Created by martinb on 3/21/2018.
 */

        import java.util.List;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("generated_at")
    @Expose
    private String generatedAt;
    @SerializedName("schema")
    @Expose
    private String schema;
    @SerializedName("tournaments")
    @Expose
    private List<Tournament> tournaments = null;

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

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

}