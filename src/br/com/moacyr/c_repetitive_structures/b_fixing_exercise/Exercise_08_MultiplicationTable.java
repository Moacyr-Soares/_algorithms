package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_08_MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");

        int N = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {

            System.out.println(N + " x " + i + " = " + N * i);
        }

    }
}
