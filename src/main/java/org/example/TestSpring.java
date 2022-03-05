package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



        ClassicalMusic cm = ClassicalMusic.getClassicalMusic();
//        ClassicalMusic classicalMusic = context.getBean(
//                "classicalMusicBean",
//                ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println("starting volume: " + musicPlayer.getVolume());
//
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.setVolume(288);
//        System.out.println("result volume: " + musicPlayer.getVolume());
//        System.out.println(musicPlayer == musicPlayer1);
//
//        musicPlayer.playMusic();
//        System.out.println("player name: "
//                + musicPlayer.getName());
//        System.out.println("volume: "
//                + musicPlayer.getVolume());
//        musicPlayer.playMusicList();

        context.close();
    }

}
