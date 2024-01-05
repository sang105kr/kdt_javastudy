package com.kh.day11.q13;

public class ItemSales {
    private double numberSold;      // 총 판매 수량
    private double sales;           // 총 판매금액
    private double discounts;       // 총 할인금액
    private double itemCost;        // 판매 가격
    private double bulkMin;         // 대량 판매 수량
    private double bulkDiscount;    // 대량 판매 할인율 (10진수표현 ex)30% => 30)

    public ItemSales(double itemCost, double bulkMin, double bulkDiscount) {
        this.itemCost = itemCost;
        this.bulkMin = bulkMin;
        this.bulkDiscount = bulkDiscount;
    }

    public void displaySales() {
//        누적 판매 수량, 누적 판매금액과 누적 할인금액
        System.out.println("누적 판매 수량 : " + numberSold);
        System.out.println("누적 판매금액 : " + sales);
        System.out.println("누적 할인금액 : " + discounts);
    }

    public void resisterSale(int n) {
        if( !(n > 0) ) return;  // 0 이하의 판매수량이 들어오면 처리하지 않음.

        //(1)	한 판매의 기본 판매 금액을 계산한다
        double basicCost = itemCost * n;

        //(2)	할인 금액을 0으로 초기화한다
        double discountGiven = 0; // 0.0

        //(3)	총 판매 수량 = 총 판매 수량 + n
        numberSold += n;
        //(4)	판매 수량이 대량 판매 수량보다 크거나 같다면 할인 금액을 계산한다
        if(n >= bulkMin) {
            discountGiven = basicCost * bulkDiscount / 100;
        }
        //(5)	총 판매금액에 (기본 판매 금액 – 할인 금액)을 더한다
        sales += basicCost - discountGiven;

        //(6)	총 할인금액에 할인 금액을 더한다
        discounts += discountGiven;
    }


    public double getNumberSold() {
        return numberSold;
    }

    public void setNumberSold(double numberSold) {
        this.numberSold = numberSold;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getBulkMin() {
        return bulkMin;
    }

    public void setBulkMin(double bulkMin) {
        this.bulkMin = bulkMin;
    }

    public double getBulkDiscount() {
        return bulkDiscount;
    }

    public void setBulkDiscount(double bulkDiscount) {
        this.bulkDiscount = bulkDiscount;
    }
}
