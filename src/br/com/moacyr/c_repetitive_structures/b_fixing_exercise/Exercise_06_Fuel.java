package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_06_Fuel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code = 0, alcohol = 0, gasoline = 0, diesel = 0;

        while (code != 4){

            System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");

            code = sc.nextInt();

            if (code == 1){

                alcohol ++;
            }
            if (code == 2){

                gasoline ++;
            }
            if (code == 3){

                diesel ++;
            }
        }
        System.out.println("MUITO OBRIGADO");

        System.out.println("Alcool: " + alcohol);

        System.out.println("Gasolina: " + gasoline);

        System.out.println("Diesel: " + diesel);
    }
}
