package com.example.martinb.quiz.data.remote;

import com.example.martinb.quiz.model.Player;
import com.example.martinb.quiz.model.Tournament;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by martinb on 3/21/2018.
 */

public interface ApiClient {

    final String BASE_URL = "https://api.sportradar.us/soccer-t3/eu/";

    @GET("en/tournaments.json")
    Single<Tournament> getTournament(@Query("api_key")String API_KEY);


}
