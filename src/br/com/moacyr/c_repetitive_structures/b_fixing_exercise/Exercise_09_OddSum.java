package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_09_OddSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");

        int x = sc.nextInt();

        int y = sc.nextInt();

        int sum = 0;

        if (x < y){

            for (int i = x; i < y; i++) {

                if (i % 2 > 0){

                    sum += i;
                }
            }
        }

        System.out.println("SOMA DOS IMPARES = ");
    }
}
