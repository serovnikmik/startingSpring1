package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private static int IDCounter = 1;

    private int id;
    @Autowired
    private MusicPlayer musicPlayer;

    public Computer(){
        this.id = IDCounter;
        IDCounter++;
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
        System.out.println("Computer id: " + id);
        musicPlayer.playMusic();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

}
