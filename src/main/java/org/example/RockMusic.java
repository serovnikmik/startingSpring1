package org.example;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{

    @Override
    public String getSong(){
        return "This is rockkk!!!";
    }

}
