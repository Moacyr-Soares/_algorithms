package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_09_Cafeteria {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double quantityPurchased, amountToPay, priceOfTheProduct;

        priceOfTheProduct = 0;

        int code;

        System.out.print("Código do produto comprado: ");

        code = sc.nextInt();

        switch (code){
            case 1:
                priceOfTheProduct = 5.0;
                break;
            case 2:
                priceOfTheProduct = 3.50;
                break;
            case 3:
                priceOfTheProduct = 4.80;
            case 4:
                priceOfTheProduct = 8.90;
                break;
            case 5:
                priceOfTheProduct = 7.32;
                break;
            default:
                System.out.println("Informe um código válido");
                break;
        }

        System.out.print("Quantidade comprada: ");
        quantityPurchased = sc.nextInt();

        amountToPay = quantityPurchased * priceOfTheProduct;

        System.out.printf("Valor a pagar: R$ %.2f", amountToPay);

        sc.close();
    }
}
