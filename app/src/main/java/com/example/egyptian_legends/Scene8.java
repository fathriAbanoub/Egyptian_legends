package com.example.egyptian_legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene8);

        Button endingBlessingButton = findViewById(R.id.buttonEndingBlessing);
        endingBlessingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for the ending
                Intent intent = new Intent(Scene8.this, Ending.class);
                startActivity(intent);
            }
        });
    }
}
