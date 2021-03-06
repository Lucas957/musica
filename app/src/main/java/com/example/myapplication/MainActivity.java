package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView6);

        Glide.with(this).load("https://img.youtube.com/vi/qxXr2CYjHl8/0.jpg").into(imageView);

        player = MediaPlayer.create(getApplicationContext(), R.raw.musica);

    }

    public void play(View view){
        player.start();
    }
}