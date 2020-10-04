package com.company;

import java.util.Scanner;

public class Main {
    static Parabola p1, p2;
    static Circle c1, c2;

    static Scanner in;

    public static void printColor(double x, double y){
        Color col = getColor(x,y);
        System.out.printf("( %.3f ; %.3f ) -> %s\n",x,y,col);
    }


    public static void main(String[] args) {
        p1= new Parabola(0.5, 3, 1.5);
        p2 = new Parabola(-0.25, -3, -5);
        c1 = new Circle(1,-3,3);
        c2 = new Circle(0,-3,5);
        in = new Scanner(System.in);

        printColor(0,0);
        printColor(-4,1);
        printColor(1,-1);
        printColor(-11,0);
        printColor(1,-4);
        printColor(-1.5,-1.5);
        printColor(-1.5,-3);

        System.out.print("Введите x, y \nx = ");
        double x = in.nextDouble();
        System.out.print("y = ");
        double y = in.nextDouble();
        System.out.println();
        printColor(x,y);


    }
    public static Color getColor(double x, double y){
        if (p1.isInnerPoint(x,y) && p2.isInnerPoint(x,y) && !c2.isInnerPoint(x,y)){
            return Color.ORANGE;
        }
        if (!p2.isInnerPoint(x,y) && !p1.isInnerPoint(x,y) && !c2.isInnerPoint(x, y)){
            return Color.ORANGE;
        }
        if (!p1.isInnerPoint(x,y) && !p2.isInnerPoint(x,y) && c1.isInnerPoint(x,y)){
            return Color.ORANGE;
        }
        if (!p1.isInnerPoint(x,y) && p2.isInnerPoint(x,y) && !c2.isInnerPoint(x,y) && x>=0){
            return Color.BLUE;
        }
        if (!p1.isInnerPoint(x,y) && p2.isInnerPoint(x,y) && !c1.isInnerPoint(x,y) && c2.isInnerPoint(x,y)){
            return Color.BLUE;
        }
        if (p1.isInnerPoint(x,y) && !p2.isInnerPoint(x,y) && c1.isInnerPoint(x,y)){
            return Color.BLUE;
        }
        if (!p1.isInnerPoint(x,y) && !p2.isInnerPoint(x,y) && c2.isInnerPoint(x,y) && !c1.isInnerPoint(x,y)){
            return Color.GREEN;
        }
        if (!p1.isInnerPoint(x,y) && p2.isInnerPoint(x,y) && c1.isInnerPoint(x,y)){
            return Color.GREEN;
        }
        if (p1.isInnerPoint(x,y) && p2.isInnerPoint(x,y) && c2.isInnerPoint(x,y) && !c1.isInnerPoint(x,y)){
            return Color.GRAY;
        }
        return Color.WHITE;
    }
}
