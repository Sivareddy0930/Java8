package Demo;

import java.lang.Math;
import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public int getArea() {
        double area = Math.PI * radius * radius;
        return (int) Math.ceil(area);
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        double area = width * height;
        return (int) Math.ceil(area);
    }
}

class Square {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public int getArea() {
        double area = width * width;
        return (int) Math.ceil(area);
    }
}

public class Demo1 {
    public static void main(String[] args) {
    	
    	Scanner sc =new Scanner(System.in);
    	
    	float radius=sc.nextFloat();
        Circle circle = new Circle(radius);
        System.out.println( circle.getArea());
        
        float width=sc.nextFloat();
        float height=sc.nextFloat();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println( rectangle.getArea());
        
         radius=sc.nextFloat();
        Circle circle2 = new Circle(radius);
        System.out.println( circle2.getArea());

         width=sc.nextFloat();
        Square square = new Square(width);
        System.out.println( square.getArea());
        
         width=sc.nextFloat();
        height=sc.nextFloat();
        Rectangle rectangle2 = new Rectangle(width,height);
        System.out.println( rectangle2.getArea());
        
    }
}
