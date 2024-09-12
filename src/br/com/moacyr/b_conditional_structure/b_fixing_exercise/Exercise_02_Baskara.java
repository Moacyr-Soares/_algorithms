package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_Baskara {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double coefficientA, coefficientB, coefficientC, delta, x, x2;

        System.out.print("Coeficiente A: ");
        coefficientA = sc.nextDouble();

        System.out.print("Coeficiente B: ");
        coefficientB = sc.nextDouble();

        System.out.print("Coeficiente C: ");
        coefficientC = sc.nextDouble();

        delta = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;

        x = (-coefficientB + Math.sqrt(delta))/ (2 * coefficientA);

        x2 = (-coefficientB - Math.sqrt(delta))/ (2 * coefficientA);

        if (delta < 0){
            System.out.println("Esta equação não possui raízes reais ");
        }
        else{
            System.out.printf("X1 = %.4f%n", x);

            System.out.printf("X2 = %.4f%n", x2);
        }

        sc.close();
    }
}
