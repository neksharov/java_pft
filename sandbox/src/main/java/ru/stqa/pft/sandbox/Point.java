package ru.stqa.pft.sandbox;

//√(xb - xa)2 + (yb - ya)2
public class Point {
    public static double distance(Pointdata p1, Pointdata p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}