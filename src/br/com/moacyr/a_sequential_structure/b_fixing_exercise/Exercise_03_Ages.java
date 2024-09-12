package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_Ages {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String name, name2;
        int age, age2;
        double average;

        System.out.println("Dados da primeira pessoa:");

        System.out.print("Nome: ");

        name = sc.nextLine();

        System.out.print("Idade: ");

        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");

        name2 = sc.nextLine();

        System.out.print("Idade ");

        age2 = sc.nextInt();
        sc.nextLine();

        average = (double) (age + age2) /2;

        System.out.printf("A idade média de %s e %s é de %.1f anos%n", name, name2, average);

        sc.close();
    }
}
