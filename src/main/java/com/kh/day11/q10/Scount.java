package com.kh.day11.q10;

public class Scount {

    private String name;        // 이름
    private int boxesSold;   // 판매한 과자 상자 수

    public Scount(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void updatSales(int cnt) {
        boxesSold += cnt;
    }

    @Override
    public String toString() {
        return  "이름 : '" + name + '\'' +
                ", 판매한 과자상자 수 : " + boxesSold;

    }
}
