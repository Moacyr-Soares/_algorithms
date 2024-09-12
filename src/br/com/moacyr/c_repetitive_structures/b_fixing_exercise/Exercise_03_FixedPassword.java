package br.com.moacyr.c_repetitive_structures.b_fixing_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_FixedPassword {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int correctPassword = 2002;

        System.out.print("Digite a senha: ");

        int password = sc.nextInt();

        while(correctPassword != password){

            System.out.print("Senha inválida! Tente novamente: ");

            password = sc.nextInt();
        }
        System.out.println("Acesso permitido! ");

        sc.close();
    }
}