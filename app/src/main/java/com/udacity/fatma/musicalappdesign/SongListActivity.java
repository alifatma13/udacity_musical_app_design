package com.udacity.fatma.musicalappdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongListActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        Button home = findViewById(R.id.home);
        Button podCast = findViewById(R.id.podcast);
        Button myMusic = findViewById(R.id.myMusic);
        Button song = findViewById(R.id.song);

        home.setOnClickListener(this);
        podCast.setOnClickListener(this);
        myMusic.setOnClickListener(this);
        song.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                Intent home = new Intent(this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.podcast:
                Intent podCast = new Intent(this, PodCastActivity.class);
                startActivity(podCast);
                break;
            case R.id.myMusic:
                Intent myMusic = new Intent(this, MyMusicActivity.class);
                startActivity(myMusic);
                break;
            case R.id.song:
                Intent song = new Intent(this, SongDetailActivity.class);
                startActivity(song);
                break;

        }
    }
}
