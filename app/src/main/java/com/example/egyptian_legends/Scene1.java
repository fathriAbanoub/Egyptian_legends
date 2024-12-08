package com.example.egyptian_legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene1);

        Button enterTombButton = findViewById(R.id.buttonEnterTomb);
        enterTombButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Scene2 (Antechamber)
                Intent intent = new Intent(Scene1.this, Scene2.class);
                startActivity(intent);
            }
        });

        Button examineHieroglyphsButton = findViewById(R.id.buttonExamineHieroglyphs);
        examineHieroglyphsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Scene2 (Antechamber) with a different scenario
                Intent intent = new Intent(Scene1.this, Scene2.class);
                intent.putExtra("examinedHieroglyphs", true);
                startActivity(intent);
            }
        });
    }
}
