package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_VerifiedChange {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double unitPrice, moneyReceived, missing, change;
        int quantityPurchased;

        System.out.print("Preço unitário do produto: " );
        unitPrice = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        quantityPurchased = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        moneyReceived = sc.nextDouble();

        if (unitPrice * quantityPurchased > moneyReceived){

            missing = unitPrice * quantityPurchased - moneyReceived;

            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", missing);
        }
        else{
            change = moneyReceived - unitPrice * quantityPurchased;

            System.out.printf("TROCO = %.2f", change);
        }
        sc.close();
    }
}
