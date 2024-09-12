package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_GrowingProblem {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois números");

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y){

            if (x > y){

                System.out.println("DECRESCENTE");
            }
            else{

                System.out.println("CRESCENTE");
            }
            System.out.println("Digite dois números");

            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
