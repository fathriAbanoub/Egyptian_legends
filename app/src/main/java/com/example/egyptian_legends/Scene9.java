package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene9 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene9);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.entrance_wind);
        mediaPlayer.start();

        Button enterPalaceButton = findViewById(R.id.buttonEnterPalace);
        enterPalaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene9.this, Scene10.class);
                startActivity(intent);
            }
        });

        Button inspectEntranceButton = findViewById(R.id.buttonInspectEntrance);
        inspectEntranceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for inspecting the entrance
                Intent intent = new Intent(Scene9.this, Scene10.class);
                intent.putExtra("inspectedEntrance", true);
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
