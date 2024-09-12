package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_Rectangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double base;
        double height;
        double area;
        double perimeter;
        double diagonal;

        System.out.print("Base do retângulo ");
        base = sc.nextDouble();

        System.out.print("Altura do retângulo ");
        height = sc.nextDouble();

        area = base * height;

        perimeter = base * 2 + height * 2;

        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(height, 2));

        System.out.printf("AREA %.4f%n", area);

        System.out.printf("PERIMETRO %.4f%n", perimeter);

        System.out.printf("DIAGONAL %.4f%n", diagonal);

        sc.close();
    }
}
