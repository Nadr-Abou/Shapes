package org.example;

public class Circle extends Shape{

    private double raggio;
    private double area;
    private double perimetro;

    public Circle() {
    }

    public Circle(double raggio) {
        setRaggio(raggio);
        perimetro = calcoloPerimetro();
        area = calcoloArea();
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio >= 0 ? raggio : 0;
    }
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double calcoloPerimetro(){
        return (double) Math.round((raggio*Math.PI*2)*100)/100;
    }

    public double calcoloArea(){
        return (double) Math.round((Math.pow(raggio,2)*Math.PI)*100) / 100;
    }

    @Override
    public String toString() {
        return "Questo è un cerchio \ncon RAGGIO: "+raggio+"\ncon PERIMETRO: "+perimetro+"\ncon AREA: "+area;
    }
}
