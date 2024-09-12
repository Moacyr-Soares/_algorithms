package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_09_Measures {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A, B, C, areaOfTheSquare, areaOfTheTriangle, trapezoidArea;

        System.out.print("Digite a media de A: ");
        A = sc.nextDouble();

        System.out.print("Digite a media de B: ");
        B = sc.nextDouble();

        System.out.print("Digite a media de C: ");
        C = sc.nextDouble();

        areaOfTheSquare = Math.pow(A, 2);
        System.out.printf("AREA DO QUADRADO = %.4f%n", areaOfTheSquare);

        areaOfTheTriangle = A * B / 2;
        System.out.printf("AREA DO TRIANGULO = %.4f%n", areaOfTheTriangle);

        trapezoidArea = (A + B) / 2 * C;
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", trapezoidArea);

        sc.close();
    }
}
