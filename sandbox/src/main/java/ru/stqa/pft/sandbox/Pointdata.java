package ru.stqa.pft.sandbox;

public class pointData {
    public static void main(String[] args) {
        Point p1 = new Point(2, 6);
        Point p2 = new Point(0, 9);
        System.out.println("Расстояние между точками = Точка 1 (" + p1.x + ";" + p1.y + ") + Точка 2 (" + p2.x + ";" + p2.y + ")" + " = " + p1.distance(p2));

    }

}
