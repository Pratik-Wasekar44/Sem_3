abstract class Shape {
 
  public abstract double calculateArea();


  public String getName() {
    return this.getClass().getSimpleName();
  }
}


class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}


class Square extends Shape {
  private double sideLength;

  public Square(double sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double calculateArea() {
    return sideLength * sideLength;
  }
}

public class AbstractExamples {
  public static void main(String[] args) {
    
    // Shape shape = new Shape();  // This will cause an error

    Circle circle = new Circle(5);
    Square square = new Square(4);

    System.out.println("Circle area: " + circle.calculateArea());
    System.out.println("Square area: " + square.calculateArea());

    
    System.out.println("Circle name: " + circle.getName());
    System.out.println("Square name: " + square.getName());
  }
}
