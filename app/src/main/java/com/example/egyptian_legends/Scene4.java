package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene4 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene4);

        // Initialize and play the sound
        mediaPlayer = MediaPlayer.create(this, R.raw.ominous_music);
        mediaPlayer.start();

        Button stopWallsButton = findViewById(R.id.buttonStopWalls);
        stopWallsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene4.this, Scene6.class);
                startActivity(intent);
            }
        });

        Button escapeChamberButton = findViewById(R.id.buttonEscapeChamber);
        escapeChamberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scene4.this, Scene2.class);
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
