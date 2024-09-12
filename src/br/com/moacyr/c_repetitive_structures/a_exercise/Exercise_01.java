package br.com.moacyr.c_repetitive_structures.a_exercise;

import java.util.Scanner;

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int sum = 0;

        while (x != 0){

            sum = sum + x;

            x = sc.nextInt();
        }

        System.out.println(sum);
    }
}
