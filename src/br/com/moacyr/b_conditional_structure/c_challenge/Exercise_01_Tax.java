package br.com.moacyr.b_conditional_structure.c_challenge;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_Tax {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double annualSalary, salary, serviceProvision,
                capitalGain, medicalExpenses, educationalExpenses,
                deductibleExpenses, totalGrossTax, maximumDeductible, taxDue,
                salaryTax =0;

        System.out.print("Renda anual com salário: ");

        annualSalary = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");

        serviceProvision = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");

        capitalGain = sc.nextDouble();

        System.out.print("Gastos médicos: ");

        medicalExpenses = sc.nextDouble();

        System.out.print("Gastos educacionais: ");

        educationalExpenses = sc.nextDouble();

        System.out.println();

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");

        System.out.println();

        System.out.println("CONSOLIDADO DE RENDA:");

        salary = annualSalary/12;

        if (salary < 3000.0 && salary > 0.0){

            System.out.println("Imposto sobre salário: Isento");
        }
        else if (salary >= 3000.0 && salary < 5000.0) {

            salaryTax = annualSalary * 0.1;

            System.out.printf("Imposto sobre salário: %.2f%n", salaryTax);
        }
        else{

            salaryTax = annualSalary * 0.2;

            System.out.printf("Imposto sobre salário: %.2f%n", salaryTax);
        }

        if (serviceProvision >= 0){

            serviceProvision = serviceProvision * 0.15;

            System.out.printf("Imposto sobre serviço: %.2f%n", serviceProvision);
        }

        if (capitalGain >= 0){

            capitalGain = capitalGain * 0.2;

            System.out.printf("Imposto sobre ganho de capital: %.2f%n", capitalGain);
        }

        System.out.println();

        System.out.println("DEDUÇÕES:");

        totalGrossTax = salaryTax + serviceProvision + capitalGain;

        maximumDeductible = totalGrossTax * 0.3;

        System.out.printf("Máximo dedutível: %.2f%n", maximumDeductible);

        deductibleExpenses = medicalExpenses + educationalExpenses;

        System.out.printf("Gastos dedutível: %.2f%n", deductibleExpenses);

        System.out.println();

        System.out.println("RESUMO:");

        System.out.printf("Imposto bruto total: %.2f%n", totalGrossTax);

        if (deductibleExpenses < maximumDeductible){

            System.out.printf("Abatimento: %.2f%n", deductibleExpenses);

            taxDue = totalGrossTax - deductibleExpenses;

            System.out.printf("Imposto devido: %.2f%n", taxDue);
        }
        else{
            System.out.printf("Abatimento: %.2f%n", maximumDeductible);

            taxDue = totalGrossTax - maximumDeductible;

            System.out.printf("Imposto devido: %.2f%n", taxDue);
        }
        sc.close();
    }
}
