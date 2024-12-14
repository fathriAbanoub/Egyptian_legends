package com.example.egyptian_legends;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene10 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene10);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.grand_hall_whispers);
        mediaPlayer.start();

        boolean inspectedEntrance = getIntent().getBooleanExtra("inspectedEntrance", false);

        Button investigateWhispersButton = findViewById(R.id.buttonInvestigateWhispers);
        investigateWhispersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene10.this, Scene11.class);
                startActivity(intent);
            }
        });

        Button continueExploringButton = findViewById(R.id.buttonContinueExploring);
        continueExploringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene10.this, Scene12.class);
                startActivity(intent);
            }
        });

        if (inspectedEntrance) {
            // Show a message or change the scenario based on the inspected entrance
            // For now, we'll just navigate to Scene11 as an example
            Intent intent = new Intent(Scene10.this, Scene11.class);
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
