package com.henzmontera.memesoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    SoundPool soundpool;
    int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10,sound11,sound12,sound13,sound14
            ,sound15,sound16,sound17,sound18,sound19,sound20,sound21,sound22,sound23,sound24,sound25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundpool = new SoundPool.Builder()
                    .setMaxStreams(10)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundpool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundpool.load(this, R.raw.bruh, 1);
        sound2 = soundpool.load(this, R.raw.ohhellnaw, 1);
        sound3 = soundpool.load(this, R.raw.stopthecap, 1);
        sound4 = soundpool.load(this, R.raw.aaaauuuggg, 1);
        sound5 = soundpool.load(this, R.raw.agik, 1);
        sound6 = soundpool.load(this, R.raw.airhorn, 1);
        sound7 = soundpool.load(this, R.raw.badangdalawangbesesnayan, 1);
        sound8 = soundpool.load(this, R.raw.bingchilling, 1);
        sound9 = soundpool.load(this, R.raw.bomboclat, 1);
        sound10 = soundpool.load(this, R.raw.cricketsakward, 1);
        /*sound11 = soundpool.load(this, R.raw.fbiopenup, 1);
        sound12 = soundpool.load(this, R.raw.goatscream, 1);
        sound13 = soundpool.load(this, R.raw.itsonlyagame, 1);
        sound14 = soundpool.load(this, R.raw.masonakogago, 1);
        sound15 = soundpool.load(this, R.raw.mgabobo, 1);
        sound16 = soundpool.load(this, R.raw.nameisjohncena, 1);
        sound17= soundpool.load(this, R.raw.oof, 1);
        sound18 = soundpool.load(this, R.raw.ps2startup, 1);
        sound19 = soundpool.load(this, R.raw.tahptahptahp, 1);
        sound20 = soundpool.load(this, R.raw.wellberightback, 1);
        sound21 = soundpool.load(this, R.raw.whatthehell, 1);
        sound22 = soundpool.load(this, R.raw.yareurunning, 1);
        sound23 = soundpool.load(this, R.raw.yualwayslying, 1);
        sound24 = soundpool.load(this, R.raw.ok, 1);
        sound25 = soundpool.load(this, R.raw.yareugae, 1);*/

    }

    public void playSound(View v){
        switch (v.getId()) {
            case R.id.Bruh_Button:
                soundpool.play(sound1, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.hellnah_Button:
                soundpool.play(sound2, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.stopthecap_Button:
                soundpool.play(sound3, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.agik:
                soundpool.play(sound5, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.airhorn:
                soundpool.play(sound6, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.auuuuuugggggghhhh:
                soundpool.play(sound4, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.bingchilling:
                soundpool.play(sound8, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.badangdalawangbesesnayan:
                soundpool.play(sound7, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.bomboclat:
                soundpool.play(sound9, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
            case R.id.cricketakward:
                soundpool.play(sound10, 1.5f, 1.5f, 1, 0, 1.1f);
                break;
        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        soundpool.release();
        soundpool = null;
    }
}