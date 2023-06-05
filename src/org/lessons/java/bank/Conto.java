package org.lessons.java.bank;

import java.util.Scanner;
import java.util.Random;
public class Conto {
    private int bankAccountNumber;
    private String ownerName;
    private double balance;

    public Conto(String ownerName) {
        this.bankAccountNumber = generateBankAccountNumber();
        this.ownerName = ownerName;
        this.balance = 0;
    }

    private int generateBankAccountNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Importo non valido. Riprova.");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Importo non valido. Riprova.");
        }
    }

    public void viewAccountInfo() {
        System.out.println("Numero conto: " + bankAccountNumber);
        System.out.println("Proprietario: " + ownerName);
        System.out.println("Saldo: " + balance + " €");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String username = scanner.nextLine();

        Conto conto = new Conto(username);

        System.out.println("Benvenuto, " + username + "!");
        System.out.println("Il tuo conto è stato creato con successo.");
        conto.viewAccountInfo();

        boolean continua = true;

        while (continua) {
            System.out.println("Cosa desideri fare?");
            System.out.println("1. Versa denaro");
            System.out.println("2. Preleva denaro");
            System.out.println("3. Esci");
            System.out.print("Scelta: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Quanto denaro vuoi versare? ");
                double amountDeposit = scanner.nextDouble();
                conto.deposit(amountDeposit);
                System.out.println("Versamento effettuato.");
                System.out.println("Saldo attuale: " + conto.getBalance() + " €");
            } else if (choice == 2) {
                System.out.print("Quanto denaro vuoi prelevare? ");
                double amountWithdrawal = scanner.nextDouble();
                conto.withdrawal(amountWithdrawal);
                System.out.println("Prelievo effettuato.");
                System.out.println("Saldo attuale: " + conto.getBalance() + " €");
            } else if (choice == 3) {
                continua = false;
                System.out.println("Grazie per aver utilizzato il nostro servizio. Arrivederci!");
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}