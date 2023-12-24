package models;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    // Constructor to initialize a shape with an array of points
    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    // the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).distanceTo(points.get(i + 1));
        }
        perimeter += points.get(points.size() - 1).distanceTo(points.get(0)); // Closing the shape
        return perimeter;
    }

    // the length of the longest side
    public double getLongest() {
        double longestSide = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            double sideLength = points.get(i).distanceTo(points.get(i + 1));
            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }
        longestSide = Math.max(longestSide, points.get(points.size() - 1).distanceTo(points.get(0))); // Closing the shape
        return longestSide;
    }

    // the average length of the sides
    public double getAverage() {
        double totalSideLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalSideLength += points.get(i).distanceTo(points.get(i + 1));
        }
        totalSideLength +=points.get(points.size() - 1).distanceTo(points.get(0)); // Closing the shape
        return totalSideLength / points.size();
    }
}