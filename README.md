# Úkol 2 (lekce 3) – Želva Žofka 2
Každou část úkolu vytvořte jako samostatný commit. Pokud zjistíte dodatečně v kódu nějakou chybu, nevadí, commitněte
opravu jako další commit. Pokud si chcete práci průběžně zálohovat, po commitu udělejte také push, čímž se všechny
neodeslané commity nahrají na GitHub.

# Část 1.1
Vytvořte metody na kreslení základních tvarů s parametrickou délkou strany: rovnoramenného trojúhelníku, čtverce, obdelníku a kolečka.

Následující sekce (*Opakování a detailní navedení k problému*) je myšlena jako opakování látky z hodiny, který vám
pomůže k řešení. Pokud víte, jak naprogramovat parametrizované metody zadané výše, můžete pokračovat k podnadpisu
*Část 1.2 - Detailní zadání*.

## Opakování a detailní navedení k problému
Chceme, aby základní tvary měly volitelné velikosti stran, tedy aby se jejich velikost dala nastavit. Připravíme metody
tak, aby přijímaly vstupní parametr(y). Pro zopakování je níže vidět ukázka metody `nakresliRovnostrannyTrojuhelnik()`,
která přijímá jako vstupní parametr `velikostStrany` typu `double`. Navenek je potřeba metodu zavolat s nějakou hodnotou,
uvnitř metody se `velikostStrany` chová jako proměnná (proto musí mít definovaný typ, např. `double`).

```java
Turtle zofka;

public void main(String[] args) {
zofka = new Turtle();

    zofka.setLocation(100.0, 100.0);
    // Volani metody, do ktere se preda hodnota 50.0
    nakresliRovnostrannyTrojuhelnik(50.0);

    zofka.setLocation(300.0, 100.0);
    // Volani metody, do ktere se preda hodnota 70.0
    nakresliRovnostrannyTrojuhelnik(70.0);
}

public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
    // Zde lze používat proměnnou velikostStrany.
    // Jeji hodnota je takova, s jakou byla metoda zavolana
    zofka.move(velikostStrany);
    zofka.turnLeft(120.0);
    zofka.move(velikostStrany);
    zofka.turnLeft(120.0);
    zofka.move(velikostStrany);
    zofka.turnLeft(120.0);
}
```

Metoda může přijímat i více parametrů za sebou (oddělujeme čárkou):

```java
Turtle zofka;

public void main(String[] args) {
zofka = new Turtle();

    Color cervenaBarva;
    cervenaBarva = new Color(255, 0, 0);

    zofka.setLocation(100.0, 100.0);
    // Volani metody, do ktere se preda hodnota 50.0 a objekt, ktery je v promenne cervenaBarva
    nakresliBarevnyRovnostrannyTrojuhelnik(50.0, cervenaBarva);

    zofka.setLocation(300.0, 100.0);
    // Volani metody, do ktere se preda hodnota 70.0 a in-line vytvoreny objekt barvy
    nakresliBarevnyRovnostrannyTrojuhelnik(70.0, new Color(0, 127, 255));
}

public void nakresliBarevnyRovnostrannyTrojuhelnik(double velikostStrany, Color barvaCary) {
    // Zde lze používat proměnnou velikostStrany a barvaCary:
    zofka.setPenColor(barvaCary);
    zofka.move(velikostStrany);
    zofka.turnLeft(120.0);
    zofka.move(velikostStrany);
    zofka.turnLeft(120.0);
    zofka.move(velikostStrany);
    zofka.turnLeft(120.0);
}
```

## Část 1.2 – Detailní zadání
Vytvořte tedy parametrizované metody na kreslení rovnoramenného trojuhelníku, čtverce, obdelníku a kolečka. Metody by
měly přijímat jako vstupní parametr velikost strany (typu `double`). V případě trojúhelníku ještě úhel mezi rameny.
V případě obdelníku budou nutné dva parametry (strana A, strana B). V případě kolečka se bude předávat velikost
kolečka (zda to bude poloměr, průměr nebo nějaká jiná charakteristika, nechám na vás).

Pokud chcete, jako bonus můžou metody přijímat i barvu kreslení. Není to ale povinné.

### 💡 Tip
Pokud byste chtěly vypočítat, jak má být dlouhá třetí strana rovnoramenného trojúhelníku, pokud znáte délku ramene
a úhel mezi rameny, ušetřím vás googlení analytické geometrie. Zde je metoda, která délku třetí strany vypočítá.
V hodině jsme si neukazovali, jak vypadá metoda, která vrací nějaký výstup. V tomto případě jde o kombinaci
jak vstupních parametrů, tak výstupu.

```java
public void main(String[] args) {
    double stranaC;

    double stranyAB = 100.0;
    double uhel = 90.0;
    stranaC = vypocitejDelkuTretiStrany(stranyAB, uhel);
    System.out.println("Strana A je " + stranyAB + ", strana B je " + stranyAB + ", uhel mezi nimi je " + uhel + "°.");
    System.out.println("Pak je strana C dlouha " + stranaC);
}

public double vypocitejDelkuTretiStrany(double velikostRamene, double uhelMeziRameny) {
    double tretiStrana;
    tretiStrana = Math.abs((velikostRamene * Math.sin((uhelMeziRameny * Math.PI / 180.0) / 2.0)) * 2.0);
    return tretiStrana;
}
```

# Část 2
Pomocí výše odladěných metod nakreslete následující obrázky – zmrzlinu, sněhuláka a mašinku.

![zmrzlina](/obrazky/ukol03-zmrzlina.svg)

![sněhulák](/obrazky/ukol03-snehulak.svg)

![mašinka](/obrazky/ukol03-lokomotiva.svg)




