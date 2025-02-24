package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int coordX, int coordY) {
        this.x = coordX;
        this.y = coordY;
    }

    public Point(int coordX, int coordY, int coordZ) {
        this.x = coordX;
        this.y = coordY;
        this.z = coordZ;
    }

    public double distance(Point o) {
        return Math.sqrt(Math.pow(o.x - this.x, 2) + Math.pow(o.y - this.y, 2));
    }

    public double distance3d(Point o) {
        return Math.sqrt(Math.pow(o.x - this.x, 2) + Math.pow(o.y - this.y, 2) + Math.pow(o.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
