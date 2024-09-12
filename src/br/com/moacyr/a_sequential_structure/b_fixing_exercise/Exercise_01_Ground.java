package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_Ground {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double width;
        double height;
        double area;
        double squareMeterValue;
        double landValue;

        System.out.print("Digite a largura do terreno ");
        width = sc.nextDouble();

        System.out.print("Digite o cumprimento do terreno ");
        height = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado ");
        squareMeterValue = sc.nextDouble();

        area = width * height;

        System.out.printf("Área do terreno %.2f%n", area);

        landValue = area * squareMeterValue;

        System.out.printf("Preço do terreno: %.2f%n ", landValue);

        sc.close();
    }
}
