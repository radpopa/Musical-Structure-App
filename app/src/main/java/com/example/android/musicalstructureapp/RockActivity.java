package com.example.android.musicalstructureapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create an ArrayList of songs for  Rock Songs
        ArrayList<Songs> songsList = new ArrayList<>();
        songsList.add(new Songs("Track 1", "Queen"));
        songsList.add(new Songs("Track 2", "U2"));
        songsList.add(new Songs("Track 3", "AC/DC"));
        songsList.add(new Songs("Track 4", "Metalica"));
        songsList.add(new Songs("Track 5", "Aerosmith"));
        songsList.add(new Songs("Track 6", " The Rolling Stones"));
        songsList.add(new Songs("Track 7", "Led Zeppelin"));
        songsList.add(new Songs("Track 8", "Elvis Presley"));
        songsList.add(new Songs("Track 9", "Kansas"));

        SongsAdapter songsAdapter = new SongsAdapter(this, songsList);
        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songsAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RockActivity.this, "It's playing!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

