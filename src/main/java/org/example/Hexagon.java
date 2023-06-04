package org.example;

public class Hexagon extends Shape{


    private double lato;
    private double area;
    private double perimetro;

    public Hexagon() {
    }

    public Hexagon(double lato) {
        setLato(lato);
        perimetro = calcoloPerimetro();
        area = calcoloArea();
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
        return (double) Math.round((6*lato)*100)/100;
    }

    public double calcoloArea(){
        return (double) Math.round(((lato*lato)*2.598)*100)/100;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "lato=" + lato +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
