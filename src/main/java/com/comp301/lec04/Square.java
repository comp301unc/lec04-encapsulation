package com.comp301.lec04;

public class Square {
  private Point topLeft;
  private double side;

  // Constructor
  public Square(Point topLeft, double side) {
    this.topLeft = topLeft;
    this.side = side;
  }

  // Getter method
  public double getSide() {
    return side;
  }

  // Getter method
  public Point getTopLeft() {
    return topLeft;
  }

  // Derived getter method
  public double getArea() {
    return side * side;
  }

  // Derived getter method
  public Point getTopRight() {
    return new Point(topLeft.getX() + side, topLeft.getY());
  }

  // Setter method with validation
  public void setSide(double side) {
    if (side <= 0) {
      throw new IllegalArgumentException("Explanation string");
    }
    this.side = side;
  }
}
