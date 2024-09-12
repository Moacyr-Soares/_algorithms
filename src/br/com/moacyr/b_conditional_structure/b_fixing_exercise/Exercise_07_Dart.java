package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_07_Dart {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double distanceA, distanceB, distanceC, greaterDistance;

        System.out.println("Digite as três distâncias:");
        distanceA = sc.nextDouble();
        distanceB = sc.nextDouble();
        distanceC = sc.nextDouble();

        if (distanceA > distanceB && distanceA > distanceC){

            greaterDistance = distanceA;
        }
        else if (distanceB > distanceA && distanceB > distanceC) {

            greaterDistance = distanceB;
        }
        else{

            greaterDistance =distanceC;
        }
        System.out.printf("MAIOR DISTÂNCIA %.2f%n", greaterDistance);

        sc.close();
    }
}
