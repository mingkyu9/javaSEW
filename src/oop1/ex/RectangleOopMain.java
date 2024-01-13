package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.width=10;
        rectangle.height=10;

        int area = rectangle.calulateArea();
        System.out.println("넓이"+area);
        int perimeter = rectangle.caluatePerimeter();
        System.out.println("길이"+perimeter);
        boolean square = rectangle.isSquare();
        System.out.println("정사각형?"+square);
    }
}
