package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Prodotto1", "Descrizione1", 10.0, 0.22);

        System.out.println("Codice prodotto: " + prodotto.getCode());
        System.out.println("Nome prodotto: " + prodotto.getName());
        System.out.println("Descrizione prodotto: " + prodotto.getDescription());
        System.out.println("Prezzo base del prodotto: " + prodotto.getBasePrice());
        System.out.println("Prezzo con IVA del prodotto: " + prodotto.getPriceIva());
        System.out.println("Nome esteso prodotto: " + prodotto.getFullName());

        prodotto.setName("Prodotto2");
        prodotto.setDescription("Descrizione2");
        prodotto.setPrice(15.0);
        prodotto.setIva(0.18);

        System.out.println("Nuovo nome prodotto: " + prodotto.getName());
        System.out.println("Nuova descrizione prodotto: " + prodotto.getDescription());
        System.out.println("Nuovo prezzo base del prodotto: " + prodotto.getBasePrice());
        System.out.println("Nuovo prezzo con IVA del prodotto: " + prodotto.getPriceIva());
        System.out.println("Nuovo nome esteso prodotto: " + prodotto.getFullName());
    }
}