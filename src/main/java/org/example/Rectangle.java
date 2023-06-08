package org.example;

public class Rectangle extends Shape{
    private double base;
    private double altezza;
    private double area;
    private double perimetro;
    private Cpoint Cpoint = new Cpoint();

    public Rectangle() {
    }

    public Rectangle(double base, double altezza, Cpoint point) {
        setBase(base);
        setAltezza(altezza);
        if(getAltezza() != 0 && getBase() !=0)
            setCpoint(point);
        else
            setCpoint(new Cpoint(0,0));
        area = calcoloArea();
        perimetro = calcoloPerimetro();
    }

    public Cpoint getCpoint() {
        return Cpoint;
    }

    public void setCpoint(Cpoint cpoint) {
        this.Cpoint = cpoint;
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

    public Rectangle intersezione(Rectangle other){

        double distanzaX,distanzaY,nuovaAltezza=0, nuovaBase=0,LatoSottoY=0,LatoSopraY=0, LatoSinistraX=0, LatoDestraX=0;

        //acquisizione punti centali dei rettangoli
        double thisX = this.getCpoint().getX(), thisY = this.getCpoint().getY(); //esempio other : 6
        double otherX = other.getCpoint().getX(), otherY = other.getCpoint().getY(); // this : 3


        //calcolo altezza
        if(otherY>thisY){
            LatoSottoY = otherY - other.getAltezza()/2; // 6 -4 = (x,2)
            LatoSopraY = thisY + this.getAltezza()/2; // 3 + 2 = (x,5)
            nuovaAltezza = LatoSopraY - LatoSottoY; // 5-2 = 3 <----
        }
        else if(otherY<thisY){
            LatoSottoY = thisY - this.getAltezza()/2;
            LatoSopraY = otherY + other.getAltezza()/2;
            nuovaAltezza = LatoSopraY - LatoSottoY;
        }
        else{
            if(this.getAltezza() >= other.getAltezza()){
                nuovaAltezza = other.getAltezza();
                LatoSopraY = otherY + other.getAltezza()/2;
            }
            else{
                nuovaAltezza = this.getAltezza();
                LatoSopraY = thisY + this.getAltezza()/2;
            }
        }


        //calcolco base

        if(thisX<otherX){
            LatoSinistraX = otherX - other.getBase()/2;
            LatoDestraX = thisX + this.getBase()/2;
            nuovaBase = LatoDestraX - LatoSinistraX;
        }
        else if(thisX>otherX){
            LatoSinistraX = thisX - this.getBase()/2;
            LatoDestraX = otherX + other.getBase()/2;
            nuovaBase = LatoDestraX - LatoSinistraX;
        }
        else{
            if(this.getBase() >= other.getBase()){
                nuovaBase = other.getBase();
                LatoDestraX = otherX + other.getBase()/2;
            }
            else{
                nuovaBase =this.getBase();
                LatoDestraX = thisX + this.getBase()/2;
            }
        }
        double puntoX = LatoDestraX - nuovaBase/2;
        double puntoY = LatoSopraY - nuovaAltezza/2;

        return new Rectangle(nuovaBase,nuovaAltezza,new Cpoint(puntoX,puntoY));
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                ", perimetro=" + perimetro +
                ", CpointX=" + Cpoint.getX() +
                ", CpointY=" + Cpoint.getY() +
                '}';
    }
}


