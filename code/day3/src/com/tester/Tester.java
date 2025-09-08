package com.tester;

import com.developer.geometry.*;
import java.util.Scanner;

class Tester {

    public static void main(String[] args) {
        Point2D p1, p2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y for object 1 ");
        p1 = new Point2D(sc.nextInt(), sc.nextInt());
        System.out.println(p1.show());
        System.out.println("Enter x and y for object 2 ");
        p2 = new Point2D(sc.nextInt(), sc.nextInt());
        System.out.println(p2.show());
        System.out.println(p1.isEqual((p2)) ? "Same" : "Not Same");
        System.out.println(p1.calculateDis(p2));
        System.out.println("Checking for distance ");
        System.out.println(p1.isEqual((p2)) ? "point are equal" : p1.calculateDis(p2));

    }
}
