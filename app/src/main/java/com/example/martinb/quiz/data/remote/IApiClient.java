package com.example.martinb.quiz.data.remote;

import com.example.martinb.quiz.model.Player;

import retrofit2.http.GET;

/**
 * Created by martinb on 3/21/2018.
 */

public interface ApiClient {


    @GET("url")
    Player getPlayer();


}
