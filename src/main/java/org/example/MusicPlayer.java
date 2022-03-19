package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private Music music;
    private Music music2;

    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(){

    }

    public MusicPlayer(@Qualifier("rockMusic") Music music,
                       @Qualifier("classicalMusic") Music music2){
        this.music = music;
        this.music2 = music2;
    }

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
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

//    public void setMusic(Music music){
//        this.music = music;
//    }

    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }

    public List<Music> getMusicList(){
        return this.musicList;
    }

    public void playMusic(){
        System.out.println("Playing: " + this.music.getSong());
    }

    public void playRandomMusic(){
        Random rand = new Random();
        Music randomMusic = this.musicList.get(rand.nextInt(this.musicList.size()));
        System.out.println("Playing: " + randomMusic.getPlaylist().get(
                rand.nextInt(randomMusic.getPlaylist().size())));
        System.out.println("volume: " + this.volume);
    }

    public void playRandomMusic1(){
        Random rand = new Random();
        Music randomMusic = this.musicList.get(rand.nextInt(this.musicList.size()));
        System.out.println("Playing: " + randomMusic.getSong());
        System.out.println("volume: " + this.volume);
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
