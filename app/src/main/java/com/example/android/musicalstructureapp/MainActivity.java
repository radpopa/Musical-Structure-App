package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the clasical category
        TextView classicalTextView = findViewById(R.id.clasical);
        // Set a click listener on that View
        classicalTextView.setOnClickListener(new OnClickListener() {
            // Create a new intent to open the {@link ClassicalActivity}
            @Override
            public void onClick(View view) {
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                startActivity(classicalIntent);
            }
        });

        // Find the View that shows the blues category
        TextView bluesTextView = findViewById(R.id.blues);
        // Set a click listener on that View
        bluesTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(MainActivity.this, BluesActivity.class);
                startActivity(bluesIntent);
            }
        });

        // Find the View that shows the pop category
        TextView popTextView = findViewById(R.id.pop);
        // Set a click listener on that View
        popTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }
        });

        // Find the View that shows the rock category
        TextView rockTextView = findViewById(R.id.rock);
        // Set a click listener on that View
        rockTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });
    }
}
