package com.example.egyptian_legends;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
                Intent intent = new Intent(Scene14.this,  Ending.class); // Assuming Ending.class is the final scene
                startActivity(intent);
            }
        });

        Button fightSpiritButton = findViewById(R.id.buttonFightSpirit);
        fightSpiritButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene14.this,VideoPlayerActivity.class); // Assuming Ending.class is the final scene
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
    @Override
    public void onBackPressed() {
        // Show a confirmation dialog
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(true); // Move the task to the back of the history stack
                    }
                })
                .setNegativeButton("No", null)
                .setCancelable(false) // Prevent the dialog from being dismissed by pressing the back button
                .show();
    }
}
