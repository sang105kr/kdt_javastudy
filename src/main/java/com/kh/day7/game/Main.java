package com.kh.day7.game;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "program", "freedom", "believe", "thought", "company",
                "love", "student", "teacher", "chair", "culture"
        };
        HangMan hangMan = new HangMan(words);
        hangMan.run();
    }
}
