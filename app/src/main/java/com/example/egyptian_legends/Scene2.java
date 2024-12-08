package com.example.egyptian_legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene2);

        boolean examinedHieroglyphs = getIntent().getBooleanExtra("examinedHieroglyphs", false);

        Button inspectArtifactsButton = findViewById(R.id.buttonInspectArtifacts);
        inspectArtifactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Scene3 (Secret Passage)
                Intent intent = new Intent(Scene2.this, Scene3.class);
                startActivity(intent);
            }
        });

        Button proceedToChamberButton = findViewById(R.id.buttonProceedToChamber);
        proceedToChamberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Scene4 (Main Chamber)
                Intent intent = new Intent(Scene2.this, Scene4.class);
                startActivity(intent);
            }
        });

        if (examinedHieroglyphs) {
            // Show a message or change the scenario based on the examined hieroglyphs
            // For now, we'll just navigate to Scene3 as an example
            Intent intent = new Intent(Scene2.this, Scene3.class);
            startActivity(intent);
        }
    }
}
