package de.bfw.vererbung;

public class Fahrzeug {
    protected int geschwindigkeit;

    public Fahrzeug(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
        System.out.println("Konstruktor Fahrzeug");
    }

    public Fahrzeug() {
        this(80);
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
}
