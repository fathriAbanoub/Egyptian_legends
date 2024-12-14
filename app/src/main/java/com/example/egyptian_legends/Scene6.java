package com.example.egyptian_legends;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene6 extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene6);

        Log.d("Scene6", "Initializing MediaPlayer");
        mediaPlayer = MediaPlayer.create(this, R.raw.heartbeat_sound123);
        if (mediaPlayer == null) {
            Log.e("Scene6", "MediaPlayer initialization failed");
        } else {
            mediaPlayer.start();
            Log.d("Scene6", "MediaPlayer started");
        }

        Button examineSarcophagusButton = findViewById(R.id.buttonExamineSarcophagus);
        if (examineSarcophagusButton != null) {
            examineSarcophagusButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                    Intent intent = new Intent(Scene6.this, Scene8.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e("Scene6", "Button examineSarcophagusButton is null");
        }

        Button searchRoomButton = findViewById(R.id.buttonSearchRoom);
        if (searchRoomButton != null) {
            searchRoomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                        mediaPlayer = null;
                    }
                    Intent intent = new Intent(Scene6.this, Scene2.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e("Scene6", "Button searchRoomButton is null");
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
