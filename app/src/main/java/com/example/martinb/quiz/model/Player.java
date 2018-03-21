package com.example.martinb.quiz.model;

/**
 * Created by martinb on 3/21/2018.
 */

public class Player {

    private int MatchPlayed;
    private String name;
    private String UrlToImage;
    private int Redcards;

    public Player(int MatchPlayed,String name, String UrlToImage, int redcards){
        this.MatchPlayed = MatchPlayed;
        this.name = name;
        this.UrlToImage = UrlToImage;
        this.Redcards = redcards;
    }


    public int getMatchPlayed() {
        return MatchPlayed;
    }

    public void setMatchPlayed(int matchPlayed) {
        MatchPlayed = matchPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlToImage() {
        return UrlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        UrlToImage = urlToImage;
    }

    public int getRedcards() {
        return Redcards;
    }

    public void setRedcards(int redcards) {
        Redcards = redcards;
    }
}
