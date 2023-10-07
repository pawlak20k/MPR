package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int numerZamowienia = 1;
    private int numer;
    private List<Pizza> listaPizz;

    public Order() {
        this.numer = numerZamowienia++;
        this.listaPizz = new ArrayList<>();
    }

    public void dodajPizza(Pizza pizza) {
        listaPizz.add(pizza);
    }

    public void wyswietlZamowienie() {
        System.out.println("Zamówienie #" + numer);
        for (int i = 0; i < listaPizz.size(); i++) {
            Pizza pizza = listaPizz.get(i);
            System.out.println((i + 1) + ". " + pizza.getName() + " - " + pizza.getCena() + " zł");
        }
    }
}
