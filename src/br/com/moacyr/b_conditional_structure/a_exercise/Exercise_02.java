package br.com.moacyr.b_conditional_structure.a_exercise;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours;

        System.out.println("Quantas horas");

        hours = sc.nextInt();

        if (hours < 12){
            System.out.println("Bom dia");
        }
        else{
            System.out.println("Boa tarde");
        }

        sc.close();
    }
}
