package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {
    @Test
    public void testIsPrimeTrue() {
        assertTrue(NumberAnalyzer.isPrime(2));
        assertTrue(NumberAnalyzer.isPrime(7));
        assertTrue(NumberAnalyzer.isPrime(11));
        assertTrue(NumberAnalyzer.isPrime(13));
    }

    @Test
    public void testIsPrimeFalse() {
        assertFalse(NumberAnalyzer.isPrime(1));
        assertFalse(NumberAnalyzer.isPrime(4));
        assertFalse(NumberAnalyzer.isPrime(-2));
        assertFalse(NumberAnalyzer.isPrime(0));
    }
    
    @Test
    public void testIsPerfectNumberTrue() {
        assertTrue(NumberAnalyzer.isPerfectNumber(6));
        assertTrue(NumberAnalyzer.isPerfectNumber(28));
        assertTrue(NumberAnalyzer.isPerfectNumber(496));
    }

    @Test
    public void testIsPerfectNumberFalse() {
        assertFalse(NumberAnalyzer.isPerfectNumber(1));
        assertFalse(NumberAnalyzer.isPerfectNumber(2));
        assertFalse(NumberAnalyzer.isPerfectNumber(-6));
        assertFalse(NumberAnalyzer.isPerfectNumber(0));
    }

    @Test
    public void testGcdWithPositiveNumbers() {
        assertEquals(2, NumberAnalyzer.gcd(8, 6));
        assertEquals(1, NumberAnalyzer.gcd(17, 5));
        assertEquals(5, NumberAnalyzer.gcd(15, 25));
    }

    @Test
    public void testGcdWithZero() {
        assertEquals(8, NumberAnalyzer.gcd(8, 0));
        assertEquals(5, NumberAnalyzer.gcd(0, 5));
        assertEquals(0, NumberAnalyzer.gcd(0, 0));
    }

    @Test
    public void testGcdWithNegativeNumbers() {
        assertEquals(2, NumberAnalyzer.gcd(-8, -6));
        assertEquals(1, NumberAnalyzer.gcd(-17, -5));
        assertEquals(5, NumberAnalyzer.gcd(-15, -25));
    }

    @Test
    public void testGcdWithMixedNumbers() {
        assertEquals(4, NumberAnalyzer.gcd(-8, 12));
        assertEquals(1, NumberAnalyzer.gcd(17, -5));
        assertEquals(5, NumberAnalyzer.gcd(-15, 25));
    }

    public void testLcmWithPositiveNumbers() {
        assertEquals(24, NumberAnalyzer.lcm(8, 6));
        assertEquals(17, NumberAnalyzer.lcm(17, 1));
        assertEquals(75, NumberAnalyzer.lcm(15, 25));
    }

    @Test
    public void testLcmWithZero() {
        assertEquals(0, NumberAnalyzer.lcm(8, 0));
        assertEquals(0, NumberAnalyzer.lcm(0, 5));
        assertEquals(0, NumberAnalyzer.lcm(0, 0));
    }

    @Test
    public void testLcmWithNegativeNumbers() {
        assertEquals(24, NumberAnalyzer.lcm(-8, -6));
        assertEquals(17, NumberAnalyzer.lcm(-17, -1));
        assertEquals(75, NumberAnalyzer.lcm(-15, -25));
    }

    @Test
    public void testLcmWithMixedNumbers() {
        assertEquals(24, NumberAnalyzer.lcm(-8, 12));
        assertEquals(17, NumberAnalyzer.lcm(17, -1));
        assertEquals(75, NumberAnalyzer.lcm(-15, 25));
    }
}
