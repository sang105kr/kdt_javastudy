package com.kh.day4;

import java.util.Random;

/*
    아래를 참조하여 2차원 비정방행열로 초기화 하여 반장,총무 뽑기
    송명성	박준혁
    김동환	최은석	이나영
    윤경란	최정민	윤다영	김대군
    김동회	정소라	조승민	김재현

    두구두구두~
    반장 : 홍길동
    부반장 : 홍길동2
 */
public class Question4 {
    public static void main(String[] args) {
        String[][] students = {
            {"송명성","박준혁"},
            {"김동환","최은석","이나영"},
            {"윤경란","최정민","윤다영","김대군"},
            {"김동회","정소라","조승민","김재현"},
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("두구두구두~");

        Random random = new Random();

        String classPresident = "", treasure = "";
        int colNum1, colNum2;
        int rowNum1, rowNum2;

        //반장
        rowNum1 = random.nextInt(students.length); // 0~3
        colNum1 = random.nextInt(students[rowNum1].length);
        classPresident = students[rowNum1][colNum1];

        while (true) {
            //총무
            rowNum2 = random.nextInt(students.length); // 0~3
            colNum2 = random.nextInt(students[rowNum2].length);

            // 반장, 총무 위치가 같으면 다시 위치 추출
            if( rowNum1 == rowNum2 && colNum1 == colNum2){
                continue;
            }else {
                treasure = students[rowNum2][colNum2];
                break;
            }
        }
        System.out.println("반장 : " + classPresident + "(" + rowNum1 + "," + colNum1 + ")");
        System.out.println("총무 : " + treasure + "(" + rowNum2 + "," + colNum2 + ")");
    }
}
