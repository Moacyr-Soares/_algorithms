package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_08_Consumption {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double travelledDistance, spentFuel, averageConsumption;

        System.out.print("Distância percorrida: ");

        travelledDistance = sc.nextDouble();

        System.out.print("Combustível gasto: ");

        spentFuel = sc.nextDouble();

        averageConsumption = travelledDistance/spentFuel;

        System.out.printf("Consumo médio = %.3f%n", averageConsumption);

        sc.close();
    }
}
