package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene2 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene2);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.chamber_scroll);
        mediaPlayer.start();

        boolean examinedHieroglyphs = getIntent().getBooleanExtra("examinedHieroglyphs", false);

        Button inspectArtifactsButton = findViewById(R.id.buttonInspectArtifacts);
        inspectArtifactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene2.this, Scene3.class);
                startActivity(intent);
            }
        });

        Button proceedToChamberButton = findViewById(R.id.buttonProceedToChamber);
        proceedToChamberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene2.this, Scene4.class);
                startActivity(intent);
            }
        });

        if (examinedHieroglyphs) {
            Intent intent = new Intent(Scene2.this, Scene3.class);
            startActivity(intent);
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
