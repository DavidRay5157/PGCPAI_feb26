package oops;

// variable => abstract = static/non-static    interface = static
// access modifiers => all                     public

/*
interface DemoInterface{
    public static final int a = 10;
    static void display(){
        System.out.println("Hello World");
    };
}

abstract class NameDemo implements DemoInterface{
    private String name;
    abstract void display1();
    void display2(){
        System.out.println("hello hello");
        DemoInterface.display();

    }


    //pure => all abstract
    // partial => few abstract few concrete
    //  concrete => all methods have body
}
*/
interface Olla{
    void OllaOlla();
}


abstract class Shape implements Olla {
    private String color;
    private double area;

    Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void calculateArea();

    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public void calculateArea(){
        System.out.println("the area is " + (height * width));
    }
    @Override
    public void OllaOlla(){
        System.out.println("Olla");
    }
}
class Circle extends Shape{
    private double radius;
    private static final double PI = 3.14;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        System.out.println("the area is " + (radius * PI));
    }
    @Override
    public void OllaOlla(){
        System.out.println("Olla");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red", 120, 20);
        rectangle.calculateArea();

        Circle circle = new Circle("green", 120);
        circle.calculateArea();
        circle.OllaOlla();

    }
}
