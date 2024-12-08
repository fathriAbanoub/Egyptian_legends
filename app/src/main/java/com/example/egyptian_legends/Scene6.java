package com.example.egyptian_legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene6);

        Button examineSarcophagusButton = findViewById(R.id.buttonExamineSarcophagus);
        examineSarcophagusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for examining the sarcophagus
                Intent intent = new Intent(Scene6.this, Scene8.class);
                startActivity(intent);
            }
        });

        Button searchRoomButton = findViewById(R.id.buttonSearchRoom);
        searchRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for searching the room
                Intent intent = new Intent(Scene6.this, Scene2.class);
                startActivity(intent);
            }
        });
    }
}
