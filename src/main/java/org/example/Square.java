package org.example;

public class Square extends Shape{
    private double lato;
    private double area;
    private double perimetro;

    public Square() {
    }

    public Square(double lato) {
        setLato(lato);
        area = calcoloArea();
        perimetro = calcoloPerimetro();
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato < 0 ? 0 : lato;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double calcoloPerimetro(){
        return (double) Math.round((lato*4)*100)/100;
    }

    public double calcoloArea(){
        return (double) Math.round((lato*lato)*100)/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "lato=" + lato +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
