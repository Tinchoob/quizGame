package com.example.martinb.quiz.data.remote;

import com.example.martinb.quiz.model.PlayerProfile;
import com.example.martinb.quiz.model.Post;
import com.example.martinb.quiz.model.Sport;
import com.example.martinb.quiz.model.TeamProfile;
import com.example.martinb.quiz.model.TournamentInfo;

import java.security.acl.Group;
import java.sql.SQLTransactionRollbackException;
import java.util.stream.StreamSupport;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by martinb on 3/21/2018.
 */

public interface ApiClient {

    final String BASE_URL = "https://api.sportradar.us/soccer-t3/eu/";

    @GET("en/tournaments.json")
    Single<Post> getTournament(@Query("api_key")String API_KEY);

    @GET("en/tournaments/{idTournament}/info.json")
    Single<TournamentInfo> getGroups(@Path("idTournament")String idTournament, @Query("api_key")String API_KEY);

    @GET("en/teams/{idTeam}/profile.json")
    Single<TeamProfile> getTeamsProfile(@Path("idTeam")String idTeam, @Query("api_key")String API_KEY);

    @GET("en/players/{idPlayer}/profile.json")
    Single<PlayerProfile> getPlayerProfile(@Path("idPlayer")String idPlayer, @Query("api_key")String API_KEY);

}
