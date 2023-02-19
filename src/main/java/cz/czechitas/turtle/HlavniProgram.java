package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
