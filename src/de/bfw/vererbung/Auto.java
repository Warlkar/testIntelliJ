package de.bfw.vererbung;

public class Auto extends Fahrzeug {
    protected int anzahlSitze;

    public Auto(int geschwindigkeit, int anzahlSitze) {
        super(geschwindigkeit);
        this.anzahlSitze = anzahlSitze;
        System.out.println("Konstruktor Auto");
    }

    public Auto(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }

    public Auto() {
        this(5);
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }
}
