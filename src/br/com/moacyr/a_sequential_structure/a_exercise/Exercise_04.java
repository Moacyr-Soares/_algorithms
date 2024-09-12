package br.com.moacyr.a_sequential_structure.a_exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("You typed: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("You typed: " + y);

        Locale.setDefault(Locale.US);
        double z;
        z = sc.nextDouble();
        System.out.printf("You typed: %.2f%n", z);
        System.out.println("You typed: " + z);

        char w;
        w = sc.next().charAt(0);
        System.out.println("You typed: " + w);

        String a;
        int b;
        double c;

        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.println("You typed: ");

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        sc.close();
    }
}
