package com.developer.geometry;
// Create a  class Point2D   for representing a point in x & y(int) co-ordinate system.
// (Tight encapsulation please !)
// 4.1 Create a parameterized constructor to accept x & y co-ords.
// 4.2 Add  show() method  --to return point's x & y co-ords
// 4.3 
// Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
// Hint - Ask yourself - 
// How will you invoke it from the tester ?

public class Point2D {

    private double x;
    private double y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String show() {
        return "Point x is " + x + " Point y is " + y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isEqual(Point2D p2) {
        if (this.x == p2.getX() && this.y == p2.getY()) {
            return true;
        }
        return false;
    }

    public double calculateDis(Point2D p2) {
        double xVal = Math.pow((p2.getX() - this.x), 2);
        double yVal = Math.pow((p2.getY() - this.y), 2);

        double cal = Math.sqrt((yVal + xVal));
        return cal;
    }
}
