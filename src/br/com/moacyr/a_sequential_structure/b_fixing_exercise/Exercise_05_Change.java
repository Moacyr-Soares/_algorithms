package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_Change {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double unitPrice, money, change;
        int quantityPurchased;

        System.out.print("Preço unitário do produto: ");

        unitPrice = sc.nextDouble();

        System.out.print("Quantidade comprada: ");

        quantityPurchased = sc.nextInt();

        System.out.print("Dinheiro recebido: ");

        money = sc.nextDouble();

        change = money - (unitPrice * quantityPurchased);

        System.out.println("TROCO = " + change);

        sc.close();
    }
}