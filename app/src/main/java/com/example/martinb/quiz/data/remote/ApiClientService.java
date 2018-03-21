package com.example.martinb.quiz.data.remote;

import com.example.martinb.quiz.model.Player;

/**
 * Created by martinb on 3/21/2018.
 */

public class ApiClientService {

    ApiClient apiClient = new ApiClient() {


        @Override
        public Player getPlayer() {
            return new Player(1,"Leo Messi","0");
        }



    };
}
