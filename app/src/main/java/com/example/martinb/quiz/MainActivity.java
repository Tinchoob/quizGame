package com.example.martinb.quiz;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.martinb.quiz.data.remote.ApiClientService;
import com.example.martinb.quiz.model.Player;
import com.example.martinb.quiz.model.Post;
import com.example.martinb.quiz.model.TeamProfile;
import com.example.martinb.quiz.model.TournamentInfo;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements onSelectedImage, DialogFragment.OnFragmentInteractionListener {

    @BindView(R.id.Text_imageToChoose)
    TextView Description;

    @BindView(R.id.image_one)
    ImageView imageOne;

    @BindView(R.id.image_two)
    ImageView imageTwo;


    private List<Player> playerList = new ArrayList<>();
    private List<String> questionList = new ArrayList<>();
    private Random randomizer = new Random();
    private Player player1;
    private Player player2;
    private String Question;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    private ApiClientService apiClientService = new ApiClientService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getTournaments();
    }

    @OnClick(R.id.image_one)
    void verifyImageOne() {

    }

    @OnClick(R.id.image_two)
    void verifyImageTwo() {

    }


    private boolean verifyChose() {
        return true;
    }

    private boolean verifyChoseFalse() {
        return false;
    }

    @Override
    public void response(String response) {
        if (response.equals("OK"))
            Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
        Question = questionList.get(randomizer.nextInt(questionList.size()));
        player1 = playerList.get(randomizer.nextInt(playerList.size()));
        player2 = playerList.get(randomizer.nextInt(playerList.size()));

//        Picasso.get().load(player1.getUrlToImage()).into(imageTwo);
//        Picasso.get().load(player2.getUrlToImage()).into(imageOne);

        Description.setText(Question);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

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
                Description.setText(value.getTournaments().get(0).getName());
                getGroups(value.getTournaments().get(10).getId());
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
                getTeamsProfile(value.getGroups().get(0).getTeams().get(5).getId());
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
                value.getPlayers().get(10);
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }
        };

    }
}
