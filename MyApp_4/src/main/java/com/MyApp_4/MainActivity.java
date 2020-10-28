package com.MyApp_4;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SoundPool sp;
    private int soundID1;
    private int soundID2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        soundID1 = sp.load(this, R.raw.alarm, 1);
        soundID2 = sp.load(this, R.raw.alert, 1);

        Button sound = findViewById(R.id.sound);
        sound.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        play(soundID1);
        play(soundID2);
    }

    private void play(int soundID) {
        sp.play(soundID, 1, 1, 0, 0, 1);
    }
}
