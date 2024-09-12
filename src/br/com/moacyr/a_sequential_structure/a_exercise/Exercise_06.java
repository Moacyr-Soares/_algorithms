package br.com.moacyr.a_sequential_structure.a_exercise;

public class Exercise_06 {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Square root of " + x + " = " + A);
        System.out.println("Square root of " + y + " = " + B);
        System.out.println("Square root of 25.0 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " raised to " + y + " = " + A);
        System.out.println(x + " raised to 2.0 = " + B);
        System.out.println("5.0 raised to 2.0 = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Absolute value of " + y + " = " + A);
        System.out.println("Absolute value of " + z + " = " + B);


        /*

            x = -b +- delta root
                ----------------- =   delta = b² -4ac
                        2a
        */
        double a = 5.0;
        double b = 7.0;
        double c = 3.0;

        double delta = Math.pow(b, 2.0) - 4*a*c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

    }
}
