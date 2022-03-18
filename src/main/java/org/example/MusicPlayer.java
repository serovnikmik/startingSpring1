package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusicBean")
    private Music music;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(){

    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusicBean") Music music){
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

//    @Autowired
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

    public void playMusicList(){
        System.out.println(
                "Starting playing current playlist");
        for (Music music : this.musicList){
            System.out.println("Playing: " +
                    music.getSong());
        }
    }



}
