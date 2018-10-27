package org.hillel.hometask1;

public class Start {

    public static void main(String[] args) {
	int r = MyCalc.add(5,7);
        System.out.println("5 add 7 = " + r);
        r = MyCalc.sub(100, 35);
        System.out.println("100 sub 35 = " + r);
        r = MyCalc.mul(33,3);
        System.out.println("33 * 3 = " + r);
        r = MyCalc.div(200, 50);
        System.out.println("200 div 50 = " + r);
        double z = MyCalc.add(10.2, 12.1);
        System.out.println("10.2 add 12.1 = " + z);
        z = MyCalc.sub(5.5, 3.4);
        System.out.println("5.5 - 3.4 = " + z);
        z = MyCalc.mul (100.1, 33.5);
        System.out.println("100.1 mul 33.5 = " + z);
        z = MyCalc.div(2.3, 1.1);
        System.out.println("2.3 div 1.1 = " + z);
    }

}
