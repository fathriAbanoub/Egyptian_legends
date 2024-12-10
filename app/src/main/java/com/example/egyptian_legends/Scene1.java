package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene1 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene1);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.entrance_wind);
        mediaPlayer.start();

        Button enterTombButton = findViewById(R.id.buttonEnterTomb);
        enterTombButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene1.this, Scene2.class);
                startActivity(intent);
            }
        });

        Button examineHieroglyphsButton = findViewById(R.id.buttonExamineHieroglyphs);
        examineHieroglyphsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene1.this, Scene2.class);
                intent.putExtra("examinedHieroglyphs", true);
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
