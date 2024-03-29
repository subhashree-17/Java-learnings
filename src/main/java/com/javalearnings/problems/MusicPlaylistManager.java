package com.javalearnings.problems;

public class MusicPlaylistManager {
    public static void main(String[] args) {

        Song song1 = new Song("Shape of You", "Ed Sheeran");
        Song song2 = new Song("Believer", "Imagine Dragons");
        Song song3 = new Song("Someone Like You", "Adele");


        Playlist playlist = new Playlist();


        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);


        playlist.displayPlaylist();


        playlist.removeSong(song2);


        playlist.displayPlaylist();


        playlist.playPlaylist();
    }
}
