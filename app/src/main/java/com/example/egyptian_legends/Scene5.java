package com.example.egyptian_legends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Scene5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene5);

        Button readScrollButton = findViewById(R.id.buttonReadScroll);
        readScrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for reading the scroll
                Intent intent = new Intent(Scene5.this, Scene7.class);
                startActivity(intent);
            }
        });

        Button leaveScrollButton = findViewById(R.id.buttonLeaveScroll);
        leaveScrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement the logic for leaving the scroll
                Intent intent = new Intent(Scene5.this, Scene2.class);
                startActivity(intent);
            }
        });
    }
}
