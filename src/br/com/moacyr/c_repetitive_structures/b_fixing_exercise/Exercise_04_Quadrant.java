package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_Quadrant {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite os valores das coordenadas X Y: ");

        x = sc.nextInt();

        y = sc.nextInt();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0){

                System.out.println("QUADRANTE Q1");
            }
            else if (x > 0 && y < 0) {

                System.out.println("QUADRANTE Q4");
            }
            else if (x < 0 && y < 0) {

                System.out.println("QUADRANTE Q3");
            }
            else if (x < 0 && y > 0) {

                System.out.println("QUADRANTE Q2");
            }

            System.out.println("Digite os valores das coordenadas X Y");

            x = sc.nextInt();
            y = sc.nextInt();

        }    }
}
