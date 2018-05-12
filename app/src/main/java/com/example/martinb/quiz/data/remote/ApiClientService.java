package com.example.martinb.quiz.data.remote;

import com.example.martinb.quiz.model.PlayerProfile;
import com.example.martinb.quiz.model.Post;
import com.example.martinb.quiz.model.TeamProfile;
import com.example.martinb.quiz.model.TournamentInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.security.acl.Group;

import io.reactivex.Single;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by martinb on 3/21/2018.
 */

public class ApiClientService {

    private ApiClient apiClient = null;
    private ApiClientService instance = null;

    final String API_KEY = "y9zkwzf8djrz4fp99wut4yxr";

    public ApiClientService() {

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiClient.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiClient = retrofit.create(ApiClient.class);
    }


    public Single<Post> getTournament(){
        return apiClient.getTournament(API_KEY);
    }

    public Single<TournamentInfo> getGroups(String tournamentId){
        return apiClient.getGroups(tournamentId,API_KEY);
    }

    public Single<TeamProfile> getTeamsProfile(String teamId){
        return apiClient.getTeamsProfile(teamId,API_KEY);
    }

    public Single<PlayerProfile> getPlayerProfile(String playerId){
        return apiClient.getPlayerProfile(playerId,API_KEY);
    }
}
