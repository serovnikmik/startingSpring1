package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Computer {

    private static int IDCounter = 1;

    private int id;
    private MusicPlayer musicPlayer;

    public Computer(){
        this.id = IDCounter;
        IDCounter++;
    }

    public Computer(MusicPlayer musicPlayer){
        this.id = IDCounter;
        IDCounter++;
        this.musicPlayer = musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString(){
        return "Computer" + " " + id + " " + musicPlayer.getMusic();
    }

    public void playMusic(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Computer id: " + this.id);
        musicPlayer.playMusic();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void playRandomMusic(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Computer id: " + this.id);
        musicPlayer.playRandomMusic();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void playRandomMusic1(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Computer id: " + this.id);
        musicPlayer.playRandomMusic1();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

}
