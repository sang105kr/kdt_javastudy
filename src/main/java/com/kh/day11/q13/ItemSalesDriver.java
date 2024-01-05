package com.kh.day11.q13;

public class ItemSalesDriver {
    public static void main(String[] args) {
    //	판매 가격이 1000이고 대량 판매 수량은 10이고 대량 판매 할인율은 30%인 ItemSales 객체를 생성하여 lunchBoxSeller가 가리키게 한다.
        ItemSales lunchBoxSeller = new ItemSales(1000, 10, 30);
    //	도시락을 한 개를 판 내역을 출력한다
        System.out.println("도시락 1개를 판매함. 할인률 적용되지않아 판매가격은 1000원임");
    //	도시락을 한 개를 판 판매 내역을 기록한다
        lunchBoxSeller.resisterSale(1);
    //	도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.
        lunchBoxSeller.displaySales();
    //	도시락을 9 개를 판 내역을 출력한다
        System.out.println("도시락 9개를 판매함. 할인률 적용되지않아 판매가격은 9000원임");
    //	도시락을 9 개를 판 판매 내역을 기록한다
        lunchBoxSeller.resisterSale(9);
    //	도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.
        lunchBoxSeller.displaySales();
    //	도시락을 10 개를 판 내역을 출력한다
        System.out.println("도시락 10개를 판매함. 할인률 적용되어 판매가격은 7000원임");
    //	도시락을 10 개를 판 판매 내역을 기록한다
        lunchBoxSeller.resisterSale(10);
    //	도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.
        lunchBoxSeller.displaySales();
    //	도시락을 50 개를 판 내역을 출력한다
        System.out.println("도시락 50개를 판매함. 할인률 적용되어 판매가격은 35,000원임");
    //	도시락을 50 개를 판 판매 내역을 기록한다
        lunchBoxSeller.resisterSale(50);
    //	도시락의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다.
        lunchBoxSeller.displaySales();
    }
}
