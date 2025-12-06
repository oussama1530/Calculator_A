package com.pantxi.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
//    @Test
//    public void test(){
//        Calculator c1 = new Calculator();
//        c1.add(4,6);
//        assertEquals(4,c1.add(2,2));
//    }
//
//    @Test
//    public void test1(){
//        Calculator c1 = new Calculator();
//        assertEquals(3,c1.divide(6,2));
//    }
//    @Test
//    public void test3(){
//        Calculator c1 = new Calculator();
//        assertEquals(2,c1.divide(10,5));
//    }

    private Calculator calculator;

    @BeforeEach
    public void Setup(){
        calculator = new Calculator();
        System.out.println("Calculator créé pour le test");
    }
    @Test
    public void testAddition() {
        // PLUS BESOIN de "Calculator c1 = new Calculator();"
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testDivision1() {
        assertEquals(3, calculator.divide(6, 2));
    }

    @Test
    public void testDivision2() {
        assertEquals(2, calculator.divide(10, 5));
    }

    // Vous pouvez aussi tester les cas d'erreur
    @Test
    public void testDivisionParZero() {
        // Test d'exception (division par zéro)
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }


}