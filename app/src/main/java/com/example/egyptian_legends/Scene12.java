package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene12 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene12);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.artifact_agitation);
        mediaPlayer.start();

        Button takeArtifactButton = findViewById(R.id.buttonTakeArtifact);
        takeArtifactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene12.this, Scene13.class); // Assuming Scene13 is the next scene
                startActivity(intent);
            }
        });

        Button leaveArtifactButton = findViewById(R.id.buttonLeaveArtifact);
        leaveArtifactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene12.this, Scene14.class); // Assuming Scene14 is the next scene
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
