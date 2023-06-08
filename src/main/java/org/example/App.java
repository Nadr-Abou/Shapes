package org.example;

public class App
{
    public static void main( String[] args )
    {
        Rectangle R1 = new Rectangle(10,4,new Cpoint(9,4));
        Rectangle R2 = new Rectangle(6,8,new Cpoint(13,8));
        Rectangle R3 = R1.intersezione(R2);
        System.out.println(R3);
    }

}
