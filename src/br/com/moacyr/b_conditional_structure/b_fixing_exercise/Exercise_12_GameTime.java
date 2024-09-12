package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Scanner;

public class Exercise_12_GameTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start, end, duration;

        System.out.print("Hora inicial: ");
        start = sc.nextInt();

        System.out.print("Hora final: ");
        end = sc.nextInt();

        if (start >= end){
            duration = (24 - start) + end;
            System.out.printf("O jogo durou %d hora(s)", duration);
        }
        if (start < end){
            duration = end -start;
            System.out.printf("O jogo durou %d hora(s)", duration);
        }
        sc.close();
    }
}
