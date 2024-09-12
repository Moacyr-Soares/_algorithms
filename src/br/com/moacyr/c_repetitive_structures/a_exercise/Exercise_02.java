package br.com.moacyr.c_repetitive_structures.a_exercise;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número ");

        int N = sc.nextInt();

        int sum = 0, number;

        for (int i = 0; i < N; i++){

            System.out.println("Número ");
            number = sc.nextInt();

            sum = sum + number;

        }

        System.out.println(sum);
    }
}
