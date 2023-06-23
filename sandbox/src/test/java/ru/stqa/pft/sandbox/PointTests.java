package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    //разные значения
    public void testDistance(){
        Point p1 = new Point(2, 6);
        Point p2 = new Point(7, 9);
        Assert.assertEquals(p1.distance(p2), 5.830951894845301);
    }
    //одинковые значения
    @Test
    public void testSameData(){
        Point p1 = new Point(3, 3);
        Point p2 = new Point(3, 3);
        Assert.assertEquals(p1.distance(p2), 0);
    }
    //отрицательные значения
    @Test
    public void testNegativeData(){
        Point p1 = new Point(-1, -8);
        Point p2 = new Point(-5, -3);
        Assert.assertEquals(p1.distance(p2), 6.4031242374328485);
    }
}
