package com.kh.day11.q1;

public class Student {
    private int hakbun; //학번
    private String name; //이름
    private int testscore1; //시험점수 1
    private int testscore2; //시험점수 2
    private int testscore3; //시험점수 3

    public Student(int hakbun, String name, int testscore1, int testscore2, int testscore3) {
        this.hakbun = hakbun;
        this.name = name;
        this.testscore1 = testscore1;
        this.testscore2 = testscore2;
        this.testscore3 = testscore3;
    }

    public void setScore(int num, int score) {
        switch (num) {
            case 1 : testscore1 = score;
                break;
            case 2 : testscore2 = score;
                break;
            case 3 : testscore3 = score;
                break;
        }
    }

    public int getScore(int num) {
        int score = -1; // 번호에 해당되는 점수가 없을때 -1반환
        switch (num) {
            case 1 : score = testscore1;
                     break;
            case 2 : score = testscore2;
                     break;
            case 3 : score = testscore3;
                     break;
        }
        return score;
    }

    public double getAverage(){
        return (testscore1 + testscore2 + testscore3) / (double)3;
    }


    @Override
    public String toString() {
        String str = "";
        str += "학번 : " + hakbun + "\n";
        str += "이름 : " + name + "\n";
        str += "testscore1 : " + testscore1 + "\n";
        str += "testscore2 : " + testscore2 + "\n";
        str += "testscore3 : " + testscore3 + "\n";
        str += "평균 : " + getAverage() + "\n";
        return str;
    }
}
