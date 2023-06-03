package com.niit.jdp;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        // initialize a scanner
        Scanner sc = new Scanner(System.in);
        // take side as input from user
        double side = sc.nextDouble();
        // take radius as input from user
        double radius = sc.nextDouble();
        // take length and width as input from user
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        // create a variable of class name for calling the method
        AreaCalculator area = new AreaCalculator();
        // call the area of square method and calculate the area of square using that
        System.out.println(AreaCalculator.areaOfSquare(side));
        // call the area of circle method and calculate the area of circle using that
        System.out.println(AreaCalculator.areaOfCircle(radius));
        // call the area of rectangle method and calculate the area of rectangle using that
        System.out.println(AreaCalculator.areaOfRectangle(length,width));

    }
    // create a method for area of square
    public static double areaOfSquare(double side){
        double areaOfSquare= (side*side);
        return areaOfSquare;
    }
    // create a method for area of circle
    public static double areaOfCircle(double radius){
        double areaOfCircle = (3.14*radius*radius);
        return areaOfCircle;
    }
}
