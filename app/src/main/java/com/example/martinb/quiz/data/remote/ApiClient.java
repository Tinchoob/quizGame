package com.example.martinb.quiz.data.remote;

import com.example.martinb.quiz.model.Player;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by martinb on 3/21/2018.
 */

public interface ApiClient {

    final String BASE_URL = "https://api.sportradar.us/soccer-t3/eu/";
    final String API_KEY = "qfhx9vnxf9z657956575g8pd";



    @GET("en/tournaments.json")
    Player getTournament( @Query("api_key")String API_KEY);


}
