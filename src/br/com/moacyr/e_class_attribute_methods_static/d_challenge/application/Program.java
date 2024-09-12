package br.com.moacyr.e_class_attribute_methods_static.d_challenge.application;

import br.com.moacyr.e_class_attribute_methods_static.d_challenge.entities.Bill;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        Bill bill = new Bill();

        System.out.print("Sexo: ");

        bill.setGender(sc.nextLine().charAt(0));

        System.out.print("Quantidade de cervejas: ");

         bill.setBeer(sc.nextInt());

        System.out.print("Quantidade de refrigerantes: ");

        bill.setSoftDrink(sc.nextInt());

        System.out.print("Quantidade de espetinhos: ");

        bill.setBarbecue(sc.nextInt());

        System.out.println();

        System.out.println("RELATÓRIO:");

        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());

        if (bill.cover() <= 0){

            System.out.println("Isento de Couvert");
        }
        else{

            System.out.printf("Covert = R$ %.2f%n", bill.cover());
        }

        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());

        System.out.println();

        System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());













    }
}
