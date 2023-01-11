package com.materna.exercises.digits;
import java.awt.Polygon;

public class BermudaTriangle {
    public static void main(String[] args) {
        /*java.awt.Polygon polygon = new java.awt.Polygon();
        java.awt.Point point = new java.awt.Point(15, 15);

        polygon.addPoint(10, 10);
        polygon.addPoint(20, 20);
        polygon.addPoint(10, 20);

        if(polygon.contains(point.x, point.y))  {
            System.out.println("Es befindet sich im polygon!");
        }

        for(int i=1; i<50; i++) {
            for(int j=1; j<50; j++) {
                if(i==1 || i==49 || j==1 || j==49)  {
                System.out.print("\uD83C\uDF08");
                }
                else{
                    boolean is_in_the_polygon = polygon.contains(i, j);
                    System.out.print(is_in_the_polygon ? "\uD83D\uDC19" : "\uD83C\uDF2B");
                }
            }
            System.out.print("\n");
        }*/
        Polygon abc = new Polygon();
        System.out.print(resetWithRandomTriangle(abc));
    }

    static Polygon resetWithRandomTriangle(Polygon polyggon) {
        polyggon.reset();
        for(int i=0; i<3; i++)  {
            polyggon.addPoint((int)Math.random() * 50 + 1, (int)Math.random() * 50 + 1);
        }
        return polyggon;
    }

    static Polygon createRandomTriangle()   {
        return resetWithRandomTriangle(new Polygon());
    }
}
