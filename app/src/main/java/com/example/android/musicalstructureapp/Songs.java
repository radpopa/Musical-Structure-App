package com.example.android.musicalstructureapp;


public class Songs {

    // Artists Names
    private String mArtistName;

    // Songs Names
    private String mSongNames;
    /*
     * Create a new object.
     *
     * @param Artist is the Artists name.
     * @param Song is the Song name.
     */
    public Songs(String Song, String Artist) {

        mSongNames = Song;
        mArtistName = Artist;
    }

    // Gets the name of the song.
    public String getSongName() {
        return mSongNames;
    }

    // Gets the name of the Artist.
    public String getArtistName() {
        return mArtistName;
    }

}
