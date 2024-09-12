package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_GradeValidation {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota ");

        double noteA = sc.nextDouble();

        while (noteA < 0 || noteA > 10){

            System.out.print("Valor invalido! Tente novamente: ");

            noteA = sc.nextDouble();
        }

        System.out.print("Digite a segunda nota ");

        double noteB = sc.nextDouble();

        while (noteB < 0 || noteB > 10){

            System.out.print("Valor invalido! Tente novamente: ");

            noteB = sc.nextDouble();
        }

        double average = (noteA + noteB) / 2;

        System.out.printf("MEDIA = %.2f%n", average);

        sc.close();
    }
}
