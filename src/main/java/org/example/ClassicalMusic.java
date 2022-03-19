package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music{

    private List<String> songs = new ArrayList<String>(){{
        add("Classical Song 1");
        add("Classical Song 2");
        add("Classical Song 3");
    }};

    public ClassicalMusic(){

    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization (CM)");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction (CM)");
    }

    @Override
    public String getSong(){
        return "Hungarian Rapsody";
//        Random rand = new Random();
//        return this.songs.get(rand.nextInt(songs.size()));
    }

    @Override
    public List<String> getPlaylist(){
        return songs;
    }

}
