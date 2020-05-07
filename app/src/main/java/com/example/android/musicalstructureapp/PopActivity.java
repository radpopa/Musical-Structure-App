package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        // Create an ArrayList of songs for  Pop Songs
        ArrayList<Songs> songsList = new ArrayList<>();
        songsList.add(new Songs("Track 1", "Madona"));
        songsList.add(new Songs("Track 2", "Pet Shop Boys"));
        songsList.add(new Songs("Track 3", "Pharrell Williams"));
        songsList.add(new Songs("Until", "Sting "));
        songsList.add(new Songs("Track 5", "Dalida"));
        songsList.add(new Songs("Track 6", " Abba"));
        songsList.add(new Songs("Les Valses De Vienne", "Francois Feldman"));
        songsList.add(new Songs("Track 8", "France Gall"));
        songsList.add(new Songs("A toi", "Joe Dassin"));

        SongsAdapter songsAdapter = new SongsAdapter(this, songsList);
        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songsAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PopActivity.this, "It's playing!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

