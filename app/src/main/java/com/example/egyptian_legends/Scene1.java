package com.example.egyptian_legends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

    @Override
    public void onBackPressed() {
        // Show a confirmation dialog
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish(); // Close the app
                    }
                })
                .setNegativeButton("No", null)
                .setCancelable(false) // Prevent the dialog from being dismissed by pressing the back button
                .show();
    }
}
