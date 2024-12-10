package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene3 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene3);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.mechanical_clicks);
        mediaPlayer.start();

        Button enterSecretPassageButton = findViewById(R.id.buttonEnterSecretPassage);
        enterSecretPassageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene3.this, Scene5.class);
                startActivity(intent);
            }
        });

        Button continueExploringButton = findViewById(R.id.buttonContinueExploring);
        continueExploringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene3.this, Scene2.class);
                startActivity(intent);
            }
        });
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
