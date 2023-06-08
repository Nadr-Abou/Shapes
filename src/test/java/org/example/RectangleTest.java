package org.example;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {


    //funzionamento di base - primo quadrante
    public void testIntersezione() {
        Rectangle R1 = new Rectangle(10,4,new Cpoint(9,4));
        Rectangle R2 = new Rectangle(6,8,new Cpoint(13,8));
        Rectangle R3 = R1.intersezione(R2);
        System.out.println(R3);
    }

    //funzionamento di base terzo quadrante

    public void testIntersezione3Quad() {
        Rectangle R1 = new Rectangle(8,6,new Cpoint(-6,-5));
        Rectangle R2 = new Rectangle(10,6,new Cpoint(-11,-7));
        Rectangle R3 = R1.intersezione(R2);
        System.out.println(R3);
    }


    //Valori negativi

    public void testIntersezioneNeg() {
        Rectangle R1 = new Rectangle(-8,-6,new Cpoint(-6,-5));
        Rectangle R2 = new Rectangle(-10,-6,new Cpoint(-11,-7));
        Rectangle R3 = R1.intersezione(R2);
        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R3);
    }

    //Stesso rettangolo
    public void testIntersezioneEqual() {
        Rectangle R1 = new Rectangle(10,5,new Cpoint(9,4));
        Rectangle R2 = new Rectangle(10,5,new Cpoint(9,4));
        Rectangle R3 = R1.intersezione(R2);
        System.out.println(R3);
    }


    //other più piccolo ma uguale centro
    public void testIntersezioneOtherMinor() {
        Rectangle R1 = new Rectangle(10,5,new Cpoint(9,4));
        Rectangle R2 = new Rectangle(6,3,new Cpoint(9,4));
        Rectangle R3 = R1.intersezione(R2);
        System.out.println(R3);
    }

    //this più piccolo ma uguale centro
    public void testIntersezioneThisMinor() {
        Rectangle R1 = new Rectangle(10,5,new Cpoint(9,4));
        Rectangle R2 = new Rectangle(20,10,new Cpoint(9,4));
        Rectangle R3 = R1.intersezione(R2);
        System.out.println(R3);
    }


}