package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in;
    static double r1, r2, r3, s;
    static int a, b,c,d;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print("Введите r1, r2, r3 \n");
        System.out.print("r1 = ");
        r1 = in.nextDouble();
        System.out.print("r2 = ");
        r2 = in.nextDouble();
        System.out.print("r3 = ");
        r3 = in.nextDouble();
        System.out.print("Колличество частей 1 типа - ");
        a = in.nextInt();
        System.out.print("Колличество частей 2 типа - ");
        b = in.nextInt();
        System.out.print("Колличество частей 3 типа - ");
        c = in.nextInt();
        System.out.print("Колличество частей 4 типа - ");
        d = in.nextInt();
        s = a*Area1(r1)+b*Area2(r1,r2)+c*Area3(r3,r2)+d*Area4(r3);
        System.out.println();
        System.out.printf("Площадь заштрихованной части фигуры = %.3f",s);


    }
    public static double Area1(double r1){
        return  Math.PI*r1*r1/8;
    }
    public static double Area2(double r1, double r2){
        return (Math.PI*r2*r2-Math.PI*r1*r1)/8;
    }
    public static double Area3(double r3,double r2){
        return  (Math.PI*r3*r3-Math.PI*r2*r2)/8;
    }
    public static double Area4(double r3){
        return  (4*r3*r3-Math.PI*r3*r3)/8;
    }
}
