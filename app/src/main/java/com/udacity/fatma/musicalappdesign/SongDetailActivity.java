package com.udacity.fatma.musicalappdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongDetailActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        Button home = findViewById(R.id.home);
        Button podCast = findViewById(R.id.podcast);
        Button myMusic = findViewById(R.id.myMusic);

        //Added OnClick Listener to the buttons
        home.setOnClickListener(this);
        podCast.setOnClickListener(this);
        myMusic.setOnClickListener(this);
    }

    //Action to be performed on Button Click
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                //Intent to go to Home Screen
                Intent home = new Intent(this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.podcast:
                //Intent to go to Podcast screen
                Intent podCast = new Intent(this, PodCastActivity.class);
                startActivity(podCast);
                break;
            case R.id.myMusic:
                //Intent to go to My Music Screen
                Intent myMusic = new Intent(this, MyMusicActivity.class);
                startActivity(myMusic);
                break;
        }
    }
}
