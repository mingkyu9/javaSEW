package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

     int calulateArea(){
        return width*height;
    }
     int caluatePerimeter(){
        return 2*(width+height);
    }
     boolean isSquare(){
        return width==height;
    }
}
