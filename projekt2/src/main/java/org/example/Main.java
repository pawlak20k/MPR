package org.example;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Margarita", 20.0, Size.MALA);
        Pizza pizza2 = new Pizza("Pepperoni", 25.0, Size.DUZA);
        Pizza pizza3 = new Pizza("Hawajska", 22.0, Size.SREDNIA);

        System.out.println("Pizza 1 - Rozmiar: " + pizza1.getRozmiar() + ", Cena: " + pizza1.getCena() + " zł");
        System.out.println("Pizza 2 - Rozmiar: " + pizza2.getRozmiar() + ", Cena: " + pizza2.getCena() + " zł");
        System.out.println("Pizza 3 - Rozmiar: " + pizza3.getRozmiar() + ", Cena: " + pizza3.getCena() + " zł");
    }
}
