
package com.example.martinb.quiz.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoverageInfo {

    @SerializedName("live_coverage")
    @Expose
    private Boolean liveCoverage;

    public Boolean getLiveCoverage() {
        return liveCoverage;
    }

    public void setLiveCoverage(Boolean liveCoverage) {
        this.liveCoverage = liveCoverage;
    }

}
