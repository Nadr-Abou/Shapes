package org.example;

public abstract class Shape {
    static Cpoint Cpoint = new Cpoint(0,0);

    public abstract double calcoloPerimetro();
    public abstract double calcoloArea();

    public Shape() {

    }

}
