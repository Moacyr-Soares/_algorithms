package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_03_UnderThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstValue, secondValue, thirdValue, smaller;
        smaller = 0;

        System.out.print("Primeiro valor: ");
        firstValue = sc.nextInt();

        System.out.print("Segundo valor: ");
        secondValue = sc.nextInt();

        System.out.print("Terceito valor: ");
        thirdValue = sc.nextInt();

        if (firstValue <= secondValue && firstValue <= thirdValue){
            smaller = firstValue;
        }
        else if(secondValue <= firstValue && secondValue <= thirdValue){
            smaller = secondValue;
        }
        else{
            smaller = thirdValue;
        }
        System.out.println("MENOR VALOR = " + smaller);

        sc.close();
    }
}
