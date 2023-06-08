package org.example;

public class Square extends Shape{
    private double lato;
    private double area;
    private double perimetro;
    private Cpoint Cpoint = new Cpoint();

    public Square() {
    }

    public Square(double lato, Cpoint point) {
        setLato(lato);
        setCpoint(point);
        area = calcoloArea();
        perimetro = calcoloPerimetro();
    }

    public Cpoint getCpoint() {
        return Cpoint;
    }

    public void setCpoint(Cpoint cpoint) {
        this.Cpoint = cpoint;
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
