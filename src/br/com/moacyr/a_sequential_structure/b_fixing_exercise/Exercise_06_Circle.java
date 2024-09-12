package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_06_Circle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double ray, area;

        System.out.print("Digite o valor do raio do circulo: ");

        ray = sc.nextDouble();

        area = Math.PI * Math.pow(ray, 2);

        System.out.printf("Area %.3f ", area);

        sc.close();
    }
}
