package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create an ArrayList of songs for Classical Songs
        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Track 1", "Bach"));
        songs.add(new Songs("Track 2", "Beethoven"));
        songs.add(new Songs("Track 3", "Chopin"));
        songs.add(new Songs("Track 4", "Litz"));
        songs.add(new Songs("Track 5", "Mozart"));
        songs.add(new Songs("Track 6", " Verdi"));
        songs.add(new Songs("Track 7", "Tchaikovsky"));
        songs.add(new Songs("Track 8", "Vivaldi"));
        songs.add(new Songs("Track 9", "Puccini"));


        SongsAdapter songsAdapter = new SongsAdapter(this, songs);
        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songsAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Make a Toast for the play button
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(ClassicalActivity.this, "It's playing!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

