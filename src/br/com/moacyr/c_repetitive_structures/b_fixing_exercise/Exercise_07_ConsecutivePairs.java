package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_07_ConsecutivePairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 0, number2, sum;

        System.out.print("Digite um numero inteiro: ");

        number = sc.nextInt();

        sum = number;

        int count = 2;

        if (number % 2 != 0){

            number += 1;

            sum = number;
        }

        if (number % 2 == 0){

            while (number != 0) {

                while (count < 9) {

                    if (count % 2 == 0) {

                        sum += (number + count);

                        count++;
                    }
                    count++;
                }
                System.out.println("SOMA = " + sum);

                System.out.print("Digite um numero inteiro: ");

                number = sc.nextInt();
            }
        }
    }
}
