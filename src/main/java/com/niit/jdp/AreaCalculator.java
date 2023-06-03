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
        System.out.println(AreaCalculator.areaOfSquare(radius));





    }
}
