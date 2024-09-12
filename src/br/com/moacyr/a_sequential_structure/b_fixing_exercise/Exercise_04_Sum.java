package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_04_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, sum;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();

        sum = x + y;

        System.out.println("SOMA = " + sum);

        sc.close();
    }
}
