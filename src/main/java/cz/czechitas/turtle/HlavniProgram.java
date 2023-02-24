package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        nakresliZmrzlinu(100);

        nakresliSnehulaka(50);

        zofka.turnLeft(115);
        nakresliMasinku(150);
    }

    
//*****************************************************************************************************************
//    1.CAST
//*****************************************************************************************************************
        private void nakresliRovnostrannyTrojuhlenik (double StranaA) {
        for (int i = 0; i < 3; i++) {
            zofka.move(StranaA);
            zofka.turnLeft(120);
        }
    }

        private void nakresliCverec (double delkaStrany) {

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

        private void nakresliObdelnik (double delkaDelsiStrany, double delkaKratsiStrany) {
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaDelsiStrany);
            zofka.turnRight(90);
            zofka.move(delkaKratsiStrany);
            zofka.turnRight(90);
        }
    }


        private void nakresliKruh ( double polomer) {
        zofka.penUp();
        zofka.move(polomer);
        zofka.turnLeft(90);
        zofka.penDown();
        for (int i = 0; i < 36; i++) {
            zofka.move((polomer* 6.28319)/36);
            zofka.turnLeft(10);
            }
        zofka.turnRight(90);
        }
//      **********************************************************************************************
//      2.CAST
//      **********************************************************************************************

        private void nakresliRovnoramennyTrojuhelnikSPravymUhlem(double velikostStrany) {
            zofka.move(velikostStrany);
            zofka.turnRight(135);
            var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
            zofka.move(velikostPrepony);
            zofka.turnRight(135);
            zofka.move(velikostStrany);
        }
        private void nakresliRovnoramennyTrojuhelnik(double velikost) {
        zofka.move(velikost);
        zofka.turnRight(110);
        var velikostPrepony = Math.sqrt(2*Math.pow(velikost, 2));
        zofka.move(velikostPrepony);
        zofka.turnRight(140);
        zofka.move(velikostPrepony);
        }

    public void nakresliZmrzlinu(double velikost) {

        zofka.setLocation(200.0,250.0);
        nakresliKruh(velikost);
        zofka.setLocation(190.0 - velikost,250);
        zofka.turnRight(90);
        nakresliRovnoramennyTrojuhelnik(velikost * 2);
    }


    public void nakresliSnehulaka(double velikost) {
        zofka.setLocation(600.0,200.0);
        nakresliKruh(velikost);
        zofka.setLocation(600.0,200.0 + velikost + (velikost * 1.4));
        nakresliKruh(velikost * 1.4);
        zofka.setLocation(600.0,200.0 + velikost + (velikost * 1.4) + (velikost * 1.4) + (velikost * 2));
        nakresliKruh(velikost * 2);
        zofka.setLocation(600.0 - velikost * 2,200.0 + velikost + (velikost * 1.4));
        nakresliKruh(velikost/2);
        zofka.setLocation(600.0 + velikost * 2,200.0 + velikost + (velikost * 1.4));
        nakresliKruh(velikost / 2);
    }


    public void nakresliMasinku (double velikost) {
        zofka.setLocation(1000.0,450.0);
        zofka.turnRight(135);
        nakresliObdelnik (velikost,velikost * 0.75);
        zofka.turnLeft(90);
        nakresliObdelnik(velikost * 0.75,velikost * 0.5);
//        velke kolo
        zofka.setLocation(1000 + ((velikost * 0.75) / 2 ),450.0);
        nakresliKruh((velikost * 0.75) / 2);
//        malé kolo
        zofka.setLocation(1000 - ((velikost * 0.75) / 3.5) ,450.0 + ((velikost * 0.75 / 2) /2) );
        nakresliKruh((velikost * 0.75 / 2) / 2);
//        malé kolo
        zofka.setLocation(1000 - (velikost * 0.6) ,450.0 + (velikost * 0.75 / 2) / 2 );
        nakresliKruh((velikost * 0.75 / 2) / 2);
//        Trojúhelník
        zofka.setLocation(1000 - (velikost * 0.75),465.0);
        nakresliRovnoramennyTrojuhelnikSPravymUhlem(velikost * 0.5);
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
