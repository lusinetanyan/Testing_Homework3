package org.example;

public class NumberAnalyzer {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        int max = Math.max(a, b);

        for (int lcm = max; ; lcm += max) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
        }
    }
}
