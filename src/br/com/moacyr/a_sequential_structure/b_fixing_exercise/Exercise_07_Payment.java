package br.com.moacyr.a_sequential_structure.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_07_Payment {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String name;
        double hoursWorked, hourlyRate, payment;

        System.out.print("Nome: ");
        name = sc.nextLine();

        System.out.print("Valor por hora: ");
        hourlyRate = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        hoursWorked = sc.nextDouble();

        payment = hoursWorked * hourlyRate;

        System.out.printf("O pagamento para %s deve ser %.2f%n", name, payment);

        sc.close();
    }
}
