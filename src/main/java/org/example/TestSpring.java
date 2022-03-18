package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        ClassicalMusic cm = ClassicalMusic.getClassicalMusic();
//        ClassicalMusic classicalMusic = context.getBean(
//                "classicalMusicBean",
//                ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());


//        ClassicalMusic classic = context.getBean(
//                "classicalMusicBean", ClassicalMusic.class);
//        MusicPlayer musicPlayer = context.getBean(
//                "musicPlayer", MusicPlayer.class);
//        musicPlayer.setMusicList(new ArrayList<Music>(Arrays.asList(
//                rock, classic
//        )));
//        musicPlayer.playMusic();

        ClassicalMusic classicalMusic1 = context.getBean(
                "classicalMusicBean", ClassicalMusic.class
        );
        ClassicalMusic classicalMusic2 = context.getBean(
                "classicalMusicBean", ClassicalMusic.class
        );
        System.out.println(classicalMusic1 + " " + classicalMusic2);

        RockMusic rockMusic1 = context.getBean(
                "rockMusicBean", RockMusic.class
        );
        RockMusic rockMusic2 = context.getBean(
                "rockMusicBean", RockMusic.class
        );
        System.out.println(rockMusic1 + " " + rockMusic2);

        Computer computer = context.getBean(
                "computer", Computer.class
        );
        computer.playMusic();

        context.close();
    }

}
