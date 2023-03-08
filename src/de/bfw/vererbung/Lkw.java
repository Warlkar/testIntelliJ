package de.bfw.vererbung;

public class Lkw extends Fahrzeug {
    protected double ladung;

    public Lkw(int geschwindigkeit, int ladung) {
        super(geschwindigkeit);
        this.ladung = ladung;
        System.out.println("Konstruktor LKW");
    }

    public Lkw(int ladung) {
        this.ladung = ladung;
    }

    public Lkw() {
        this(100);
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(int ladung) {
        this.ladung = ladung;
    }
}
