package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_10_Duration {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int hours, minutes, seconds;

        System.out.print("Digite a duração em segundos: ");

        seconds = sc.nextInt();

        minutes = seconds / 60;

        hours = minutes / 60;

        System.out.printf("%d:%d:%d", hours, minutes, seconds);

        sc.close();
    }
}
