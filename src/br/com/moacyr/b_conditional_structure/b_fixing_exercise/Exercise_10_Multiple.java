package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_10_Multiple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.println("Digite dois números inteiros:");
        number1 = sc.nextInt();
        number2 = sc.nextInt();

        if (number1 % number2 == 0 || number2 % number1 == 0){

            System.out.println("São multiplos");
        }
        else{
            System.out.println("Não são multiplos");
        }
        sc.close();
    }
}
