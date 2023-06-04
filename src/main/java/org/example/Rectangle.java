package org.example;

public class Rectangle extends Shape{
    private double base;
    private double altezza;
    private double area;
    private double perimetro;

    public Rectangle() {
    }

    public Rectangle(double base, double altezza) {
        setBase(base);
        setAltezza(altezza);
        area = calcoloArea();
        perimetro = calcoloPerimetro();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base < 0 ? 0 : base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza < 0 ? 0 : altezza ;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double calcoloPerimetro(){
        return (double) Math.round((2*base+2*altezza)*100)/100;
    }

    public double calcoloArea(){
        return (double) Math.round((base*altezza)*100)/100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
