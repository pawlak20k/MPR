package org.example;
public class Pizza {
    private String name;
    private double cena;
    private Size size;

    public Pizza(String name1, double cena, Size size) {
        this.name = name1;
        this.cena = cena;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getCena() {
        return cena;
    }

    public Size getRozmiar() {
        return size;
    }
}
