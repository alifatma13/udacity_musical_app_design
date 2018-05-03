package com.udacity.fatma.musicalappdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button home = findViewById(R.id.home);
        Button podCast = findViewById(R.id.podcast);
        Button myMusic = findViewById(R.id.myMusic);
        Button songList = findViewById(R.id.songList);

        home.setOnClickListener(this);
        podCast.setOnClickListener(this);
        myMusic.setOnClickListener(this);
        songList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                Intent home = new Intent(this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.podcast:
                Intent podCast1 = new Intent(this, PodCastActivity.class);
                startActivity(podCast1);
                break;
            case R.id.myMusic:
                Intent myMusic = new Intent(this, MyMusicActivity.class);
                startActivity(myMusic);
                break;
            case R.id.songList:
                Intent songList = new Intent(this, SongListActivity.class);
                startActivity(songList);
                break;

        }
    }
}
