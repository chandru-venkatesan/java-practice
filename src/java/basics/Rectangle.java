package java.basics;

public class Rectangle {
    int length;
    int width;
    int calculateArea(){
        return length*width;
    }

    static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.length= 20;
        obj.width =10;
        System.out.println("Area of Rectangle: "+obj.calculateArea());
    }
}
