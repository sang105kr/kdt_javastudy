package com.kh.day7.game;
import java.lang.*;
import java.util.Random;
import java.util.Scanner;

public class HangMan extends Object {
    String[] words;
    char[] guesstedWord;
    int attempts;

    HangMan(String[] words){
        super(); //부모클래스의 기본생성자호출
        this.words = words;
    }

    void run(){
        Random random = new Random();
        int idx = random.nextInt(words.length); //0~9
        String word = words[idx];
        attempts = word.length() + 3;   // 시도횟수 = 문자열 길이 + 3

        char[] guesstedWord = makeUnderLine(word.length());
        int attempts = word.length() + 3;   // 시도횟수 = 문자열 길이 + 3

        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("현재단어 : " + String.valueOf(guesstedWord));
            System.out.println("남은 시도 회수 :" + attempts);

            String str = "";
            while (true) {
                System.out.print("글자를 입력하세요[1글자(a~z)] : ");
                str = scanner.nextLine();
                //1글자인지 && 영문자 체크
                if (str.length() == 1 && str.matches("[a-zA-Z]")) {
                    //소문자변환
                    str = str.toLowerCase();
                    break;
                }

            }
            char ch = str.charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    guesstedWord[i] = ch;

                    if (word.equals(String.valueOf(guesstedWord))) {
                        System.out.println("축하합니다! 단어를 맞췄습니다. :" + word);
                        return;  // 메소드 종료하고 호출한곳으로 제어 이동.
                    }
                }
            }

            attempts--;
        }

        System.out.println("아쉽습니다. 단어를 맞추지 못했습니다. 정답은 " + word + " 였습니다.");

    }

    private char[] makeUnderLine(int len) {
        char[] underLine = new char[len];
        for (int i = 0; i < len; i++) {
            underLine[i] = '_';
        }
        return underLine;
    }
}
