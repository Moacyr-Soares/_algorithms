package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_Operator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int minutes;
        double amountToPay;

        System.out.print("Digite a quantidade de minutos: ");
        minutes = sc.nextInt();

        if (minutes <= 100 && minutes > 0){

            System.out.println("Valor a pagar: R$ 50.00 ");
        }
        else{
            amountToPay = 50.0 + (minutes - 100) * 2.0;

            System.out.printf("Valor a pagar: R$ %.2f", amountToPay);
        }
        sc.close();
    }
}
