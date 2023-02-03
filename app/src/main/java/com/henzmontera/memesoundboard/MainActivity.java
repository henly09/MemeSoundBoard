package com.henzmontera.memesoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton bruh,stopthecap,ohhellnaw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bruh = findViewById(R.id.Bruh_Button);
        stopthecap = findViewById(R.id.stopthecap_Button);
        ohhellnaw = findViewById(R.id.hellnah_Button);

        MediaPlayer bruhplayer = MediaPlayer.create(this, R.raw.bruh);
        MediaPlayer hellnawplayer = MediaPlayer.create(this, R.raw.ohhellnaw);
        MediaPlayer stopthecapplayer = MediaPlayer.create(this, R.raw.stopthecap);

        bruh.setOnClickListener(view -> {
            float speed = 1.25f;
            bruhplayer.setPlaybackParams(bruhplayer.getPlaybackParams().setSpeed(speed));
            if(bruhplayer.isPlaying())
                bruhplayer.seekTo(0L, MediaPlayer.SEEK_NEXT_SYNC); // continues playback from millisecond 0
            else
                bruhplayer.start();
        });

        stopthecap.setOnClickListener(view -> {
            float speed = 1.25f;
            stopthecapplayer.setPlaybackParams(stopthecapplayer.getPlaybackParams().setSpeed(speed));
            if(stopthecapplayer.isPlaying())
                stopthecapplayer.seekTo(0L, MediaPlayer.SEEK_NEXT_SYNC); // continues playback from millisecond 0
            else
                stopthecapplayer.start();
        });

        ohhellnaw.setOnClickListener(view -> {
            float speed = 1.25f;
            hellnawplayer.setPlaybackParams(hellnawplayer.getPlaybackParams().setSpeed(speed));
            if(hellnawplayer.isPlaying())
                hellnawplayer.seekTo(0L, MediaPlayer.SEEK_NEXT_SYNC); // continues playback from millisecond 0
            else
                hellnawplayer.start();
        });

    }
}