package com.example.martinb.quiz;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.martinb.quiz.model.Player;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //HIPER HARD CODED

        playerList.add(new Player(1, "Cristiano Ronaldo", "https://www.infobae.com/new-resizer/4F6iYLIjE7hXne2slDNaA3hKEAU=/600x0/filters:quality(100)/s3.amazonaws.com/arc-wordpress-client-uploads/infobae-wp/wp-content/uploads/2018/02/14180759/PSG-Real-Madrid-festejo-Cristiano-Ronaldo-1.jpg", 0));
        playerList.add(new Player(5, "Wayne Rooney", "http://e0.365dm.com/17/03/16-9/20/skysports-wayne-rooney-rooney-united-rooney-man-utd_3908370.jpg?20170312203327", 2));
        playerList.add(new Player(2, "Carlos Tevez", "https://www.elintransigente.com/u/fotografias/m/2018/1/29/f999x666-442439_537504_20.jpg", 5));
        playerList.add(new Player(10, "Antoine Griezmann", "https://prod.media.larepublica.pe/720x405/larepublica/imagen/2017/12/17/noticia-antoine-griezmann.png", 3));
        playerList.add(new Player(0, "Leonardo Bonucci", "https://cdn.images.dailystar.co.uk/dynamic/58/photos/414000/620x/Leonardo-Bonucci-669303.jpg", 10));
        playerList.add(new Player(4, "Andrea Pirlo", "https://i1.wp.com/lanaciondeportes.com/fotoedicion/2015/07/Andrea-Pirlo.jpg?w=620&ssl=1", 6));
        playerList.add(new Player(9, "Arturo Vidal", "http://www.cnnchile.com/sites/default/files/styles/imagen_destacada_840x559/public/arturo_vidal_39.jpg?itok=sT1L-kKU", 1));

        questionList.add("Who has more red Cards?");
        questionList.add("Who has played more matches?");


        player1 = playerList.get(randomizer.nextInt(playerList.size()));
        player2 = playerList.get(randomizer.nextInt(playerList.size()));

        Picasso.get().load(player1.getUrlToImage()).into(imageTwo);
        Picasso.get().load(player2.getUrlToImage()).into(imageOne);

        Question = questionList.get(randomizer.nextInt(questionList.size()));

        Description.setText(Question);
        //
    }

    @OnClick(R.id.image_one)
    void verifyImageOne() {


        if (Question.equals("Who has more red Cards?"))
            if (player1.getRedcards() > player2.getRedcards()) {
                DialogFragment dialogFragment = new DialogFragment();
                dialogFragment.setListener(this);
                dialogFragment.show(getSupportFragmentManager(), "this is a tag");
            } else if (player1.getRedcards() < player2.getRedcards()) {
                Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
            }

        if (Question.equals("Who has played more matches?"))
            if (player1.getMatchPlayed()> player2.getMatchPlayed()){
                DialogFragment dialogFragment = new DialogFragment();
                dialogFragment.setListener(this);
                dialogFragment.show(getSupportFragmentManager(), "this is a tag");
            }
            else if (player1.getMatchPlayed() < player2.getMatchPlayed()) {
                Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
            }
    }

    @OnClick(R.id.image_two)
    void verifyImageTwo() {
        if (Question.equals("Who has more red Cards?"))
            if (player1.getRedcards() < player2.getRedcards()) {

                DialogFragment dialogFragment = new DialogFragment();
                dialogFragment.setListener(this);
                dialogFragment.show(getSupportFragmentManager(), "this is a tag");
            } else if (player1.getRedcards() > player2.getRedcards()) {
                Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
            }
        if (Question.equals("Who has played more matches?"))
            if (player1.getMatchPlayed()< player2.getMatchPlayed()){
                DialogFragment dialogFragment = new DialogFragment();
                dialogFragment.setListener(this);
                dialogFragment.show(getSupportFragmentManager(), "this is a tag");
            }
            else if (player1.getMatchPlayed() > player2.getMatchPlayed()) {
                Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
            }

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

        Picasso.get().load(player1.getUrlToImage()).into(imageTwo);
        Picasso.get().load(player2.getUrlToImage()).into(imageOne);

        Description.setText(Question);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
