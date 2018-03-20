package com.example.martinb.quiz;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

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


    }

    @OnClick(R.id.image_one)
    void changeImage(){

        Picasso.get().load("https://cdn2.uvnimg.com/dims4/default/4c96f05/2147483647/thumbnail/1240x698/quality/75/?url=https%3A%2F%2Fcdn3.uvnimg.com%2Ff7%2F6f%2Fa2389cdc4b2fa5cbdaf33584a776%2Fgettyimages-642913512.jpg")
                .into(imageOne);
    }


}
