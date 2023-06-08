package org.example;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {

    public void testCalcoloPerimetro() {
        double perimetroTotale=0;

        Shape[] Shapes = {
                new Circle(10.001,new Cpoint(0,0)),
                new Square(26.25,new Cpoint(0,0)),
                new Rectangle(12.6,8.9,new Cpoint(0,0)),
                new Hexagon(7.5,new Cpoint(0,0))
        };

        for ( Shape S: Shapes) {
            perimetroTotale += S.calcoloPerimetro();
        }

        assertEquals(255.84,perimetroTotale);
    }

    public void testGetPerimetro() {
        double perimetroTotale=0;

        Shape[] Shapes = {
                new Circle(-16,new Cpoint(0,0)),
                new Square(25,new Cpoint(0,0)),
                new Rectangle(-40,-15,new Cpoint(0,0)),
                new Hexagon(-40,new Cpoint(0,0))
        };

        for ( Shape S: Shapes) {
            perimetroTotale += S.calcoloPerimetro();
        }

        assertEquals(100.0,perimetroTotale);
    }

    public void testCalcoloArea() {
        double areaTotale=0;

        Shape[] Shapes = {
                new Circle(10.001,new Cpoint(0,0)),
                new Square(26.25,new Cpoint(0,0)),
                new Rectangle(12.6,8.9,new Cpoint(0,0)),
                new Hexagon(7.5,new Cpoint(0,0))
        };

        for ( Shape S: Shapes) {
            areaTotale += S.calcoloArea();
        }

        assertEquals(1261.56,areaTotale);
    }
}