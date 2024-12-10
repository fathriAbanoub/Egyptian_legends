package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene7 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene7);

        Log.d("Scene7", "Initializing MediaPlayer");
        mediaPlayer = MediaPlayer.create(this, R.raw.triumphant_music123);
        if (mediaPlayer == null) {
            Log.e("Scene7", "MediaPlayer initialization failed");
        } else {
            mediaPlayer.start();
            Log.d("Scene7", "MediaPlayer started");
        }

        Button endingButton = findViewById(R.id.buttonEnding);
        if (endingButton != null) {
            endingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                    Intent intent = new Intent(Scene7.this, Ending.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e("Scene7", "Button endingButton is null");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
