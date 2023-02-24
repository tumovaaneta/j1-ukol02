package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {




        zofka = new Turtle();
//        //zmrzlina
//       // *******************************************************************
        zofka.setLocation(200.0,150.0);
        nakresliKruh(100);
        zofka.setLocation(300.0,200.0);
        zofka.turnLeft(90);
        nakresliTrojuhlenik(200);

//        //snehulak
////        *******************************************************************
        zofka.setLocation(500.0,150.0);
        nakresliKruh(50);
        zofka.setLocation(500.0,270.0);
        nakresliKruh(70);
        zofka.setLocation(500.0,440.0);
        nakresliKruh(100);
        zofka.setLocation(400.0,270.0);
        nakresliKruh(30);
        zofka.setLocation(600.0,270.0);
        nakresliKruh(30);


//        vlacek
//        **********************************************************************
        zofka.setLocation(900.0,450.0);
        zofka.turnRight(90);
        nakresliObdelnik (200,150);
        zofka.turnLeft(90);
        nakresliObdelnik(150,100);
        zofka.setLocation(980.0,450.0);
        nakresliKruh(60);
        zofka.setLocation(870.0,465.0);
        nakresliKruh(30);
        zofka.setLocation(800.0,465.0);
        nakresliKruh(30);
        zofka.setLocation(750.0,465.0);
        zofka.turnRight(90);
        nakresliTrojuhlenik(100);

//        zofka.setPenColor(barva);
    }


    public void nakresliTrojuhlenik (double StranaA) {
        for (int i = 0; i < 3; i++) {
            zofka.move(StranaA);
            zofka.turnLeft(120);
        }
    }

    public void nakresliCverec (double delkaStrany) {

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    public void nakresliObdelnik (double delkaDelsiStrany, double delkaKratsiStrany) {
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
            zofka.move(polomer/ 6.28319);
            zofka.turnLeft(10);
            }
        zofka.turnRight(90);
        }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
