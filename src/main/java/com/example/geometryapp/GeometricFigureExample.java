package com.example.geometryapp;


import org.example.Circle;
import org.example.Rectangle;
import org.example.Triangle;
import org.shapes.Cube;
import org.util.FigureStringName;

public class GeometricFigureExample {

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Triangle triangle = new Triangle(5, 5);
    Rectangle rectangle = new Rectangle(1, 2);
    System.out.println(circle.area());
    System.out.println(circle.perimeter());
    System.out.println(triangle.area());
    FigureStringName figureStringName = new FigureStringName(circle);
    Cube cube = new Cube(1);
  }
}
