package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class PointTest {

    @Test
    public void when02to00then2() {
        double expected = 2;
        Point first = new Point(0, 2);
        Point second = new Point(0, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to11then2() {
        double expected = 2;
        Point first = new Point(1, 3);
        Point second = new Point(1, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to22then2() {
        double expected = 2;
        Point first = new Point(2, 4);
        Point second = new Point(2, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to33then2() {
        double expected = 2;
        Point first = new Point(3, 5);
        Point second = new Point(3, 3);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when350to330then2() {
        double expected = 2;
        Point first = new Point(3, 5, 0);
        Point second = new Point(3, 3, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when240to220then2() {
        double expected = 2;
        Point first = new Point(2, 4, 0);
        Point second = new Point(2, 2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}