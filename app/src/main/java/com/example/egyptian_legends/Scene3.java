package com.example.egyptian_legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene3);

        Button enterSecretPassageButton = findViewById(R.id.buttonEnterSecretPassage);
        enterSecretPassageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for entering the secret passage
                Intent intent = new Intent(Scene3.this, Scene5.class);
                startActivity(intent);
            }
        });

        Button continueExploringButton = findViewById(R.id.buttonContinueExploring);
        continueExploringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for continuing to explore the antechamber
                Intent intent = new Intent(Scene3.this, Scene2.class);
                startActivity(intent);
            }
        });
    }
}
