package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double delta = 0.01;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double delta = 0.01;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, delta);
    }
}