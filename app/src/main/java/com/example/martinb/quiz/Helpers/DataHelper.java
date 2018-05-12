package com.example.martinb.quiz.Helpers;

import com.example.martinb.quiz.DataSendContract;
import com.example.martinb.quiz.data.remote.ApiClientService;
import com.example.martinb.quiz.model.PlayerProfile;
import com.example.martinb.quiz.model.Post;
import com.example.martinb.quiz.model.TeamProfile;
import com.example.martinb.quiz.model.TournamentInfo;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class DataHelper {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private ApiClientService apiClientService = new ApiClientService();
    private DataSendContract mListener;



    public void setListener(DataSendContract listener){
        mListener = listener;
    }


    public void getTournaments() {
        compositeDisposable.add(apiClientService.getTournament()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getTournamentObserver())
        );
    }

    private DisposableSingleObserver<Post> getTournamentObserver() {
        return new DisposableSingleObserver<Post>() {
            @Override
            public void onSuccess(Post value) {
              mListener.setTournaments(value.getTournaments());
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }
        };

    }


    public void getGroups(String tournamentId) {
        compositeDisposable.add(apiClientService.getGroups(tournamentId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getGroupsObserver())
        );
    }

    private DisposableSingleObserver<TournamentInfo> getGroupsObserver() {
        return new DisposableSingleObserver<TournamentInfo>() {
            @Override
            public void onSuccess(TournamentInfo value) {
                mListener.setGroups(value.getGroups().get(0));
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }
        };

    }

    public void getTeamsProfile(String teamId){
        compositeDisposable.add(apiClientService.getTeamsProfile(teamId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getTeamsProfileObserver())
        );
    }

    private DisposableSingleObserver<TeamProfile> getTeamsProfileObserver() {
        return new DisposableSingleObserver<TeamProfile>() {
            @Override
            public void onSuccess(TeamProfile value) {
                mListener.setTeamProfile(value);
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }
        };

    }

    public void getPlayerProfile(String playerId){
        compositeDisposable.add(apiClientService.getPlayerProfile(playerId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(getPlayerProfileOberver())
        );
    }

    private DisposableSingleObserver<PlayerProfile> getPlayerProfileOberver() {
        return new DisposableSingleObserver<PlayerProfile>() {
            @Override
            public void onSuccess(PlayerProfile value) {
                mListener.setPlayerProfile(value);
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }
        };

    }

}
