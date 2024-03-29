package com.javalearnings.problems;

import java.util.ArrayList;


public class Song {
    private String title;
    private String artist;


    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }


    public String getTitle() {
        return title;
    }


    public String getArtist() {
        return artist;
    }


    public void playSong() {
        System.out.println("Now playing: " + title + " by " + artist);
    }
}


class Playlist {
    private ArrayList<Song> songs;


    public Playlist() {
        this.songs = new ArrayList<>();
    }


    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song '" + song.getTitle() + "' added to the playlist.");
    }


    public void removeSong(Song song) {
        if (songs.contains(song)) {
            songs.remove(song);
            System.out.println("Song '" + song.getTitle() + "' removed from the playlist.");
        } else {
            System.out.println("Song '" + song.getTitle() + "' is not in the playlist.");
        }
    }


    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist:");
            for (Song song : songs) {
                System.out.println("- " + song.getTitle() + " by " + song.getArtist());
            }
        }
    }


    public void playPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty. Add songs to play.");
        } else {
            System.out.println("Playing Playlist:");
            for (Song song : songs) {
                song.playSong();
            }
        }
    }
}

