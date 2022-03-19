package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {

    private List<String> songs = new ArrayList<String>(){{
        add("Rock Song 1");
        add("Rock Song 2");
        add("Rock Song 3");
    }};

    public RockMusic(){

    }

    @Override
    public String getSong(){
        return "Rockkk!!!";
//        Random rand = new Random();
//        return this.songs.get(rand.nextInt(songs.size()));
    }

    @Override
    public List<String> getPlaylist(){
        return this.songs;
    }

}
