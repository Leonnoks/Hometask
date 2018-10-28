package org.hillel.hometask2;

public class Starter {

    public static void main(String[] args) {
	long r = Calc.methodcalc1(1, 3, 4, 2);
        System.out.println("1 add 3 mul (4 div 2) = " + r);
        int h = Calc.methodcalc2(3, 4, 2);
        System.out.println("(3 pow 3 add 4 pow 4)%2 = " + h);
        int u = Calc.methodcalc3(10, 14,11, 12, 4);
        System.out.println("(10 add 14) div 12 mul 11 % 4 + 14 = " + u);
        long q = Calc.methodcalc4(4, 2, 5);
        System.out.println("a sub b mul c) / (a add b) %c = " + q);
    }

}
