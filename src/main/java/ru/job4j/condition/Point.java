package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int coordX, int coordY) {
        this.x = coordX;
        this.y = coordY;
    }

    public double distance(Point o) {
        return Math.sqrt(Math.pow(o.x - this.x, 2) + Math.pow(o.y - this.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
