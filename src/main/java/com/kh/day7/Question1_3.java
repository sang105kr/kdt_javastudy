package com.kh.day7;

import java.util.Scanner;

/*
    단어 맞추기 게임
    단어는 'program'로 설정되어있다.
    사용자는 남은 시도 횟수 안에 정답 단어를 맟주면 게임에서 이기게되고 그렇지않으면 진다.
    단어를 맞출수 있는 회수는 단어의 문자수 + 3
    ex) program

    현재 단어 : _______
    남은 시도 회수 : 10
    글자를 입력하세요 : p
    현재 단어 : p______
    남은 시도 회수 : 9
    글자를 입력하세요 : z
    현재 단어 : p______
    남은 시도 회수 : 8
    글자를 입력하세요 : r
    현재 단어 : pr__r__
    남은 시도 회수 : 7
    글자를 입력하세요 :
    ....
    현재 단어 : progra_
    남은 시도 회수 : 1
    글자를 입력하세요 : m
    축하합니다! 단어를 맞췄습니다. : program
 */
public class Question1_2 {
    public static void main(String[] args) {
        String word = "program";
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

    public static char[] makeUnderLine(int len) {
        char[] underLine = new char[len];
        for (int i = 0; i < len; i++) {
            underLine[i] = '_';
        }
        return underLine;
    }
}
