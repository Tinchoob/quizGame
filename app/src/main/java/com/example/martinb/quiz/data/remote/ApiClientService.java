package com.example.martinb.quiz.data.remote;

import com.example.martinb.quiz.model.Post;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

    final String API_KEY = "qfhx9vnxf9z657956575g8pd";

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
}
