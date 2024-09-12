package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_AverageAge {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int age = 0, divider= 0;
        double average, sum = 0;

        System.out.println("Digite a idade ");

        age = sc.nextInt();

        while (age >= 0){

            sum += age;

            divider ++;

            age = sc.nextInt();
        }

        if (sum == 0){

            System.out.println("IMPOSSIVEL CALCULAR");
        }
        else{

            average = sum / divider;

            System.out.printf("MEDIA = %.2f%n", average);
        }

        sc.close();
    }
}
