package com.example.martinb.quiz.model;

/**
 * Created by Tincho on 21/03/2018.
 */

public class Player {

    private String urlToImage;
    private String name;
    private int popularity

    public Player(String urlToImage, String name, int popularity){
        this.urlToImage = urlToImage;
        this.name = name;
        this.popularity = popularity;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
