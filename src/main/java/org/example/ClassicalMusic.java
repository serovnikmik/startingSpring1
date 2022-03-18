package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music{

    private List<String> songs = new ArrayList<String>(){{
        add("Classical Song 1");
        add("Classical Song 2");
        add("Classical Song 3");
    }};

    private ClassicalMusic(){

    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization (CM)");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction (CM)");
    }

    @Override
    public String getSong(){
        Random rand = new Random();
        return this.songs.get(rand.nextInt(songs.size()));
    }

    @Override
    public List<String> getPlaylist(){
        return songs;
    }

}
