package com.kh.day10.exam2_2;

public class DrawingBoard {
    private Shape[] shapes;
    private int index;

    DrawingBoard(int size) {
        shapes = new Shape[size];
    }

    //도형 추가
    public void addShape(Shape shape) {
        shapes[index++] = shape;
    }

    //각 도형의 면적계산하게 하기
    public void calcuateAreas(){
        for (Shape shape : shapes) {
            if(shape != null) {
                System.out.println(shape.calculateArea());
            }
        }
    }
}
