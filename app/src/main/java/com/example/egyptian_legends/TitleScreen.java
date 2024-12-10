package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TitleScreen extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        // Initialize and play the background music
        mediaPlayer = MediaPlayer.create(this, R.raw.ancient_egypt_music);
        mediaPlayer.setLooping(true); // Loop the music
        mediaPlayer.start();

        Button startPharaohButton = findViewById(R.id.buttonStartPharaoh);
        startPharaohButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Stop the background music
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                Intent intent = new Intent(TitleScreen.this, Scene1.class);
                startActivity(intent);
            }
        });

        Button startBaronButton = findViewById(R.id.buttonStartBaron);
        startBaronButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Stop the background music
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                Intent intent = new Intent(TitleScreen.this, Scene9.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Stop the background music when the activity is stopped
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
