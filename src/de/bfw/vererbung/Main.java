package de.bfw.vererbung;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto(120,2);
        System.out.println(a1.getGeschwindigkeit());
        System.out.println(a1.getAnzahlSitze());
    }
}