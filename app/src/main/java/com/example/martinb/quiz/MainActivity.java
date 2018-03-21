package com.example.martinb.quiz;

import android.app.Activity;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;


import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements onSelectedImage,DialogFragment.OnFragmentInteractionListener  {

    @BindView(R.id.Text_imageToChoose)
    TextView Description;

    @BindView(R.id.image_one)
    ImageView imageOne;

    @BindView(R.id.image_two)
    ImageView imageTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //HIPER HARD CODED

        Picasso.get().load("http://media.libero.pe/large/libero/imagen/2018/01/07/noticia-lionel-messi.jpg").into(imageTwo);
        Picasso.get().load("http://442.perfil.com/wp-content/uploads/2017/08/0827_atleticotucuman_godoycruz_g_tel.jpg").into(imageOne);
        //
    }

    @OnClick(R.id.image_one)
    void verifyImageOne() {

        if (verifyChose()) {
            DialogFragment dialogFragment = new DialogFragment();
            dialogFragment.setListener(this);
            dialogFragment.show(getSupportFragmentManager(), "this is a tag");
        }
    }

    @OnClick(R.id.image_two)
    void verifyImageTwo(){
        if(!verifyChoseFalse()){
            Toast.makeText(getApplicationContext(),"Mal",Toast.LENGTH_SHORT).show();
        }

        }


    private boolean verifyChose(){
        return true;
    }

    private boolean verifyChoseFalse(){
        return false;
    }

    @Override
    public void response(String response) {
        if(response.equals("OK"))
            Toast.makeText(getApplicationContext(),"Bien",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
