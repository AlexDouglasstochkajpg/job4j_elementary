package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    void when11to31then2() {
        double expected = 2;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    void when22to42then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 2;
        int x2 = 4;
        int y2 = 2;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    void when33to53then2() {
        double expected = 2;
        int x1 = 3;
        int y1 = 3;
        int x2 = 5;
        int y2 = 3;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, delta);
    }
}