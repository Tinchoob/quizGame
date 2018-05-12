
package com.example.martinb.quiz.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Jersey {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("sleeve")
    @Expose
    private String sleeve;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("squares")
    @Expose
    private Boolean squares;
    @SerializedName("stripes")
    @Expose
    private Boolean stripes;
    @SerializedName("stripes_color")
    @Expose
    private String stripesColor;
    @SerializedName("horizontal_stripes")
    @Expose
    private Boolean horizontalStripes;
    @SerializedName("split")
    @Expose
    private Boolean split;
    @SerializedName("shirt_type")
    @Expose
    private String shirtType;
    @SerializedName("sleeve_detail")
    @Expose
    private String sleeveDetail;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getSquares() {
        return squares;
    }

    public void setSquares(Boolean squares) {
        this.squares = squares;
    }

    public Boolean getStripes() {
        return stripes;
    }

    public void setStripes(Boolean stripes) {
        this.stripes = stripes;
    }

    public String getStripesColor() {
        return stripesColor;
    }

    public void setStripesColor(String stripesColor) {
        this.stripesColor = stripesColor;
    }

    public Boolean getHorizontalStripes() {
        return horizontalStripes;
    }

    public void setHorizontalStripes(Boolean horizontalStripes) {
        this.horizontalStripes = horizontalStripes;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public String getShirtType() {
        return shirtType;
    }

    public void setShirtType(String shirtType) {
        this.shirtType = shirtType;
    }

    public String getSleeveDetail() {
        return sleeveDetail;
    }

    public void setSleeveDetail(String sleeveDetail) {
        this.sleeveDetail = sleeveDetail;
    }

}
