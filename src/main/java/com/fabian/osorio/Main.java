package com.fabian.osorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rectangle 1:");
        System.out.print("Top Left X: ");
        int topLeftX1 = scanner.nextInt();
        System.out.print("Top Left Y: ");
        int topLeftY1 = scanner.nextInt();
        System.out.print("Bottom Right X: ");
        int bottomRightX1 = scanner.nextInt();
        System.out.print("Bottom Right Y: ");
        int bottomRightY1 = scanner.nextInt();

        System.out.println("Rectangle 2:");
        System.out.print("Top Left X: ");
        int topLeftX2 = scanner.nextInt();
        System.out.print("Top Left Y: ");
        int topLeftY2 = scanner.nextInt();
        System.out.print("Bottom Right X: ");
        int bottomRightX2 = scanner.nextInt();
        System.out.print("Bottom Right Y: ");
        int bottomRightY2 = scanner.nextInt();

        Point topLeft1 = new Point(topLeftX1, topLeftY1);
        Point bottomRight1 = new Point(bottomRightX1, bottomRightY1);

        Point topLeft2 = new Point(topLeftX2, topLeftY2);
        Point bottomRight2 = new Point(bottomRightX2, bottomRightY2);

        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);


        System.out.println("the rectangles intersect: " + rect1.intersects(rect2));
        System.out.println("the rectangles are contained: " + rect1.contains(rect2));
        System.out.println("rectangles are adjacent: " + rect1.adjacent(rect2));


    }
}
