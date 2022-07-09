package DesignPattern;

import javafx.geometry.Point3D;

public class Result {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();
        System.out.println(swordsman.toString());

        Swordsman s2 = (Swordsman) swordsman.clone();
        System.out.println(s2);
    }
}
