package com.patterns.creationals.singleton;

public class Main {
    public static void main (String [] args){
      /*  String s1 = DemoSinlgeton.obtenerSingleton();
        String s2 = DemoSinlgeton.obtenerSingleton();

        if (s1 ==s2) {
            System.out.println("Son la misma instancia ");
        }
*/
        SpringContext springContext1 = SpringContext.getInstance();
        SpringContext springContext2 = SpringContext.getInstance();

        System.out.println(springContext1);
        System.out.println(springContext2);
    }
}
