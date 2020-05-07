package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {
    /**
     * Create a new {@link SongsAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs   is the list of {@link Songs}s to be displayed.
     */
    public SongsAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView
     *
     * @param position    The position of the data that should be displayed in the song item view
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflates the view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_items, parent, false);
        }
        // Gets the object located at this position on the list.
        Songs currentSong = getItem(position);
        // Find the TextView in the song_item.xml layout with the ID song_text_view
        TextView songsTextView = convertView.findViewById(R.id.song_text_view);
        //Gets the song name and stes the text on the Songs TextView
        songsTextView.setText(currentSong.getSongName());
        // Find the TextView in the song_items.xml layout with the ID artist_text_view
        TextView artistTextView = convertView.findViewById(R.id.artist_text_view);
        //Gets the artists name and sets the text on the Artists TextView
        artistTextView.setText(currentSong.getArtistName());
        // Returns the whole list item layout (2 TextViews )
        return convertView;
    }

}