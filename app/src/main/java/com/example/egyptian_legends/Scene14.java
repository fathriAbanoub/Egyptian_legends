package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene14 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene14);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.final_confrontation_music);
        mediaPlayer.start();

        Button useRitualButton = findViewById(R.id.buttonUseRitual);
        useRitualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene14.this, Ending.class); // Assuming Ending.class is the final scene
                startActivity(intent);
            }
        });

        Button fightSpiritButton = findViewById(R.id.buttonFightSpirit);
        fightSpiritButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene14.this, Ending.class); // Assuming Ending.class is the final scene
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
