package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HyperpopMusic implements Music{

    private List<String> songs = new ArrayList<String>(){{
        add("Hyperpop Song 1");
        add("Hyperpop Song 2");
        add("Hyperpop Song 3");
    }};

    @Override
    public String getSong(){
        return "Yeyo!";
//        Random rand = new Random();
//        return this.songs.get(rand.nextInt(songs.size()));
    }

    @Override
    public List<String> getPlaylist(){
        return this.songs;
    }

}
