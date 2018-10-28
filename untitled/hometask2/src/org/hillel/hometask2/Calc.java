package org.hillel.hometask2;

public class Calc {

    public static long methodcalc1 (long a, long b, long c, long x) {
        long result = a + b * (c / x);
        return result;
    }
    public static int methodcalc2 (int a, int b, int x) {
        int result = (a * a + b * b)%x ;
        return result;
    }
    public static int methodcalc3 ( int a, int b, int c, int x, int y) {
        int result = (a + b) / x * c%y + b;
        return result;
    }
    public static long methodcalc4 ( long a, long b, long c) {
        long result = (a - b * c) / (a + b) % c;
        return result;
    }


}
