package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(){

    }

    public MusicPlayer(Music music){
        this.music = music;
    }

    public Music getMusic(){
        return this.music;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setMusic(Music music){
        this.music = music;
    }

    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }

    public List<Music> getMusicList(){
        return this.musicList;
    }

    public void playMusic(){
        System.out.println("Playing: " +
                this.music.getSong());
    }

    public void playMusicList(){
        System.out.println(
                "Starting playing current playlist");
        for (Music music : this.musicList){
            System.out.println("Playing: " +
                    music.getSong());
        }
    }



}
