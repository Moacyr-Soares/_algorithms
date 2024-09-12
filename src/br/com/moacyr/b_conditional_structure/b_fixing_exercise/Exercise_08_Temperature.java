package br.com.moacyr.b_conditional_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_08_Temperature {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double temperature, temperatureC, temperatureF;
        char cOrF;

        System.out.print("Você vai digitar a temperatura em qual escala (C/F) ? ");

        cOrF = sc.next().charAt(0);

        if (cOrF == 'F'){

            System.out.print("Digite a temperatura em Fahrenheit");

            temperature = sc.nextDouble();

            temperatureC = (5 * (temperature - 32)) / 9;

            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", temperatureC);
        }
        else if (cOrF == 'C') {

            System.out.print("Digite a temperatura em Celsius: ");

            temperature = sc.nextDouble();

            temperatureF = temperature * 9.0 / 5.0 + 32.0;

            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", temperatureF);
        }
        else{
            System.out.println("Valor incorreto");
        }
        sc.close();
    }
}
