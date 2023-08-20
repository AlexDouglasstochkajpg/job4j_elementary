package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double delta = 0.01;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double delta = 0.01;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    void whenP20K4Square16() {
        int expected = 16;
        int p = 20;
        double k = 4;
        double delta = 0.01;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, delta);
    }
}