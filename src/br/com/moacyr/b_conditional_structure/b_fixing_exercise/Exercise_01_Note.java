package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_Note {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double note1, note2, finalGrade;

        System.out.print("Digite a primeira nota: ");
        note1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        note2 = sc.nextDouble();

        finalGrade = note1 + note2;

        System.out.printf("NOTA FINAL = %.1f%n", finalGrade);

        if (finalGrade < 60.0){
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
