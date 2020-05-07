package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BluesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        // Create an ArrayList of songs for  Blues Songs
        final ArrayList<Songs> songsList = new ArrayList<>();
        songsList.add(new Songs("Track 1", "Eric Clapton"));
        songsList.add(new Songs("Track 2", "Gary Moore"));
        songsList.add(new Songs("Track 3", "Nina Simone"));
        songsList.add(new Songs("Track 4", "B.B. King"));
        songsList.add(new Songs("Track 5", "Joe Cocker"));
        songsList.add(new Songs("Track 6", "Noora Noor"));
        songsList.add(new Songs("Track 7", "Beth Hart"));
        songsList.add(new Songs("Track 8", "Peter Green"));
        songsList.add(new Songs("Track 9", "Buddy Guy"));

        SongsAdapter songsAdapter = new SongsAdapter(this, songsList);
        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songsAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(BluesActivity.this, "It's playing!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
