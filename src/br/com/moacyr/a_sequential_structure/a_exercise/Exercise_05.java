package br.com.moacyr.a_sequential_structure.a_exercise;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Entered data: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




        int x;

        x = sc.nextInt(); // O enter dá quebra de linha. Essa quebra de linha fica pendente
        s1 = sc.nextLine(); // Absorve a quebra de linha
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Entered data: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        x = sc.nextInt();
        sc.nextLine(); //limpando o buffer de leitura
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Entered data: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
