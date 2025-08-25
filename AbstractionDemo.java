// Abstract class
abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("Displaying shape area...");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        display();
        System.out.println("Circle Area = " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        display();
        System.out.println("Rectangle Area = " + area);
    }
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);


        s1.calculateArea();
        s2.calculateArea();
    }
}
