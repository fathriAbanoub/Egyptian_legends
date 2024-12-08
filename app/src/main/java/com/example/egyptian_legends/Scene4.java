package com.example.egyptian_legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene4);

        Button stopWallsButton = findViewById(R.id.buttonStopWalls);
        stopWallsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for stopping the walls
                Intent intent = new Intent(Scene4.this, Scene6.class);
                startActivity(intent);
            }
        });

        Button escapeChamberButton = findViewById(R.id.buttonEscapeChamber);
        escapeChamberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for escaping the chamber
                Intent intent = new Intent(Scene4.this, Scene2.class);
                startActivity(intent);
            }
        });
    }
}
