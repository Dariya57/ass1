package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    // distance(Point dest) - distance from current point to the dest point

    public double distanceTo(Point dest){
        double distance =Math.pow(dest.x-this.x, 2) + Math.pow(dest.y-this.y, 2);
        return Math.sqrt(distance);
    }
    // toString

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}