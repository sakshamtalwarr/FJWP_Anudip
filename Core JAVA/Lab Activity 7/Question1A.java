// 1.Create an abstract class Shape with an abstract method calculateArea(). Implement
// two subclasses, Circle and Rectangle, which inherit from Shape and provide their own
// implementations of calculateArea(). Write a program to calculate and print the areas of
// a circle and a rectangle.





abstract class Question1 {
    abstract void calculateArea();
}

class Circle extends Question1 {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Question1 {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Question1A {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.calculateArea();
        rectangle.calculateArea();
    }
}
