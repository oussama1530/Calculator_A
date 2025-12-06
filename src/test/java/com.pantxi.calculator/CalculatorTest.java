package com.pantxi.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void test(){
        Calculator c1 = new Calculator();
        c1.add(4,6);
        assertEquals(4,c1.add(2,2));
    }

    @Test
    public void test1(){
        Calculator c1 = new Calculator();
        assertEquals(3,c1.divide(6,2));
    }
    @Test
    public void test3(){
        Calculator c1 = new Calculator();
        assertEquals(2,c1.divide(10,5));
    }



}