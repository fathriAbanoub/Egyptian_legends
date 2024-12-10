package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene11 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene11);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.library_laughter);
        mediaPlayer.start();

        Button enterLibraryButton = findViewById(R.id.buttonEnterLibrary);
        enterLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene11.this, Scene12.class);
                startActivity(intent);
            }
        });

        Button avoidLibraryButton = findViewById(R.id.buttonAvoidLibrary);
        avoidLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene11.this, Scene13.class); // Assuming Scene13 is the next scene
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
