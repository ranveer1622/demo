package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
public class PacmanGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("PacmanGame Up");
    }

    @Override
    public void down() {
        System.out.println("PacmanGame Up");
    }

    @Override
    public void left() {
        System.out.println("PacmanGame Up");
    }

    @Override
    public void right() {
        System.out.println("PacmanGame Up");
    }
}
