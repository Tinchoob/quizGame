package com.example.martinb.quiz;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.martinb.quiz.Helpers.DataHelper;
import com.example.martinb.quiz.model.Group;
import com.example.martinb.quiz.model.Player;
import com.example.martinb.quiz.model.PlayerProfile;
import com.example.martinb.quiz.model.Post;
import com.example.martinb.quiz.model.Team;
import com.example.martinb.quiz.model.TeamProfile;
import com.example.martinb.quiz.model.Tournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements DataSendContract, DialogFragment.OnFragmentInteractionListener {

    @BindView(R.id.Text_imageToChoose)
    TextView Description;

    @BindView(R.id.image_one)
    ImageView imageOne;

    @BindView(R.id.image_two)
    ImageView imageTwo;


    private List<Player> playerList = new ArrayList<>();
    private List<String> questionList = new ArrayList<>();
    private Random randomizer = new Random();
    private List<Tournament> tournaments;
    private TeamProfile teamProfile;
    private PlayerProfile playerProfile;
    private Group group;
    private String Question;
    private DataHelper dataHelper = new DataHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dataHelper.setListener(this);
        dataHelper.getTournaments();
    }


    @Override
    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
        dataHelper.getGroups(tournaments.get(2).getId());
        dataHelper.getGroups(tournaments.get(10).getId());
    }

    @Override
    public void setGroups(Group group) {
        this.group = group;
        List<Team> teams = group.getTeams();
        dataHelper.getTeamsProfile(teams.get(randomizer.nextInt(teams.size()-1)).getId());
    }

    @Override
    public void setTeamProfile(TeamProfile teamProfile) {
        this.teamProfile = teamProfile;
        List<Player> players = teamProfile.getPlayers();
        dataHelper.getPlayerProfile(players.get(randomizer.nextInt(players.size()-1)).getId());
    }

    @Override
    public void setPlayerProfile(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
        playerProfile.getStatistics().getSeasons().get(0).getStatistics().getTotals();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
