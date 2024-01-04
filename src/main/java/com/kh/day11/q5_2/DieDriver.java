package com.kh.day11.q5_2;

public class DieDriver {
    public static void main(String[] args) {
        Die d1 = new Die();
        System.out.println("die1 = " + d1.getFaceValue());
        
        Die d2 = new Die();
        System.out.println("die2 = " + d2.getFaceValue());

        int count = 0;
        for (int i = 0; i < 100; i++) {
            int face1 = d1.roll();
            int face2 = d2.roll();
            int sum = face1 + face2;


            if (sum == 7 || sum == 11) {
                count++;
                System.out.println(" => " + face1 + " , " + face2 + " = " + sum);
            }else{
                System.out.println(face1 + " , " + face2 + " = " + sum);
            }
        }
        System.out.println("count = " + count);
    }
}
