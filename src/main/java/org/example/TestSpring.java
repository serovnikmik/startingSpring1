package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean(
                "computer", Computer.class
        );
        computer.playRandomMusic();

        context.close();
    }

}
