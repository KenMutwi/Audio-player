package com.example.ken.audioplayer;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private Button btnPlay,btnBack,btnForward;
    private SeekBar seekBar;
    private MediaPlayer mediaPlayer;
    private Runnable runnable;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btnPlay);
        btnBack = findViewById(R.id.btnBackwards);
        btnForward = findViewById(R.id.btnForward);
        handler = new Handler();
        seekBar = findViewById(R.id.seekbar);
        mediaPlayer = MediaPlayer.create(this,R.raw.daima);

    }
}
