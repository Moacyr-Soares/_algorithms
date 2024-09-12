package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_11_Increase {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double wage, increase;

        System.out.print("Digite o salário da pessoa: ");
        wage = sc.nextDouble();

        if (wage > 0 && wage <= 1000.0){

            wage = wage + (increase = wage * 0.2);

            System.out.printf("Novo salário = R$ %.2f%n", wage);
            System.out.printf("Aumento = R$ %.2f%n", increase);
            System.out.println("Porcentagem = 20%");
        }
        else if (wage > 1000.0 && wage <= 3000.0 ) {

            wage = wage + (increase = wage * 0.15);

            System.out.printf("Novo salário = R$ %.2f%n", wage);
            System.out.printf("Aumento = R$ %.2f%n", increase);
            System.out.println("Porcentagem = 15%");

        }
        else if (wage > 3000.0 && wage <= 8000.0 ) {

            wage = wage + (increase = wage * 0.10);

            System.out.printf("Novo salário = R$ %.2f%n", wage);
            System.out.printf("Aumento = R$ %.2f%n", increase);
            System.out.println("Porcentagem = 10%");
        }
        else{

            wage = wage + (increase = wage * 0.05);

            System.out.printf("Novo salário = R$ %.2f%n", wage);
            System.out.printf("Aumento = R$ %.2f%n", increase);
            System.out.println("Porcentagem = 5%");
        }

        sc.close();
    }
}
