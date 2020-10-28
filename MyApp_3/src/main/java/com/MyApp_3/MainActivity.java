package com.MyApp_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    VideoView player;
    private Button start, pause, stop;
    EditText et_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);
        et_web = findViewById(R.id.et_web);
        player = findViewById(R.id.player);

        start.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

        MediaController mc = new MediaController(this);
        player.setMediaController(mc);
        mc.setMediaPlayer(player);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.start: {
                startPlayer();
                break;
            }
            case R.id.pause: {
                pausePlayer();
                break;
            }
            case R.id.stop: {
                stopPlayer();
                break;
            }
        }
    }

    private void startPlayer() {
        player.start();
        player.setVideoPath(et_web.getText().toString());
        start.setEnabled(false);
        pause.setEnabled(true);
        stop.setEnabled(true);
    }

    private void pausePlayer() {
        player.pause();
        start.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(true);
    }

    private void stopPlayer() {
        player.stopPlayback();
        player.resume();
        start.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(false);
    }
}
