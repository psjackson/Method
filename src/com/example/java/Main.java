package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create variables.
        Scanner choice = new Scanner(System.in);
        int shape;
        //create a do-while loop to hold selection of shapes the area can be calculated for.
        do {
            System.out.println("Please enter an shape to get the area of:");
            System.out.println("-----------------------------------------");
            System.out.println("1: Square.");
            System.out.println("2: Rectangle.");
            System.out.println("3: Triangle.");
            System.out.println("4: Circle.");
            //get menu option from the user
            shape = choice.nextInt();
        }while(shape != 1 && shape != 2 && shape != 3 && shape != 4);
        //a switch statement that will verify to the user what they have selected and call the respective method.
        switch (shape)
        {
            case 1:
                System.out.println("\nYou selected to get the area of a square.");
                square();
                break;
            case 2:
                System.out.println("\nYou selected to get the area of a rectangle.");
                rectangle();
                break;
            case 3:
                System.out.println("\nYou selected to get the area of a triangle.");
                triangle();
                break;
            case 4:
                System.out.println("\nYou selected to get the area of a circle.");
                circle();
                break;
        }

    }

    private static void square() {
        //get the length of one of the sides of the square from the user and assign it to a variable
        Scanner input = new Scanner(System.in);
        double length;
        System.out.println("Please enter the length of one of the squares sides in centimeters:");
        length = input.nextDouble();
        //convert the length into the area and display to the user
        double area = Math.pow(length, 2);
        System.out.println("-----------------------------------------------------------");
        System.out.println("The area of the square is: " + area + " square centimeters.");
        System.out.println("-----------------------------------------------------------");
    }

    private static void rectangle() {
        //get the height and length of the triangle from the user and assign them to variables
        Scanner input = new Scanner(System.in);
        double length;
        double height;
        System.out.println("Please enter the length of one of the rectangles LONG sides in centimeters:");
        length = input.nextDouble();
        System.out.println("Please enter the length of one of the rectangles SHORT sides in centimeters:");
        height = input.nextDouble();
        //convert the height and width into area and display to the user
        double area = length * height;
        System.out.println("-----------------------------------------------------------");
        System.out.println("The area of the rectangle is: " + area + " square centimeters.");
        System.out.println("-----------------------------------------------------------");
    }

    private static void triangle() {
        //get the height and width of the triangle from the user and assign them to variables
        Scanner input = new Scanner(System.in);
        double height;
        double width;
        System.out.println("Please enter the height of the triangle from (shortest distance from base to top) in centimeters:");
        height = input.nextDouble();
        System.out.println("Please enter the length of the base of the triangle in centimeters:");
        width = input.nextDouble();
        //convert the height and width of the triangle to area and display to user
        double area = 0.5 * height * width;
        System.out.println("-----------------------------------------------------------");
        System.out.println("The area of the triangle is: " + area + " square centimeters.");
        System.out.println("-----------------------------------------------------------");
    }

    private static void circle() {
        //get the diameter of the circle from the user and assign it to a variable
        Scanner input = new Scanner(System.in);
        double diameter;
        System.out.println("Please enter the diameter of the circle in centimeters:");
        diameter = input.nextDouble();
        //convert diameter to radius
        double radius = 0.5 * diameter;
        //convert radius to area
        double area = Math.PI * Math.pow(radius, 2);
        //round to 2 decimal places and display to user
        area = Math.round(area* 100.0) / 100.0;
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("The area of the circle is: " + area + " square centimeters (to 2 decimal places).");
        System.out.println("-------------------------------------------------------------------------------");
    }

}
