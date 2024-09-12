package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_06_Glucose {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double glucose;

        System.out.print("Digite a medida da glicose: ");
        glucose = sc.nextDouble();

        if (glucose <= 100 && glucose > 0){

            System.out.println("Classificação: normal");
        }
        else if (glucose > 100 && glucose <= 140) {

            System.out.println("Classificação: Elevado");
        }
        else{
            System.out.println("Classificação: Diabetes");
        }
        sc.close();
    }
}
