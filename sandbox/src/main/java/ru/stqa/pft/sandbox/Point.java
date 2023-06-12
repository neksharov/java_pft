package ru.stqa.pft.sandbox;

public class Point {
    public static double distance (Data p){
        return Math.sqrt((p.p3-p.p1)*(p.p3-p.p1)+(p.p4-p.p2)*(p.p4-p.p2));
    }


}