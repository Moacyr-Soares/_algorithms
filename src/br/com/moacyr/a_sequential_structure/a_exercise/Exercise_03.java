package br.com.moacyr.a_sequential_structure.a_exercise;
//  Processing
public class Exercise_03 {
    public static void main(String[] args) {

        int x, y;

        x = 5;

        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        int a;
        double b;

        a = 5;
        //converted to double type
        b = 2 * a;

        System.out.println(a);
        System.out.println(b);

        //trapeze
        double area, h, c, d;
        h = 5.0;
        c = 6.0;
        d = 8.0;

        area = (c + d)/2.0 * h;

        System.out.println(area);




        /*
            double  = int/int
            result
            2 = 5 / 2

        */
        int e, f;
        double result;
        e = 5;
        f = 2;
        result = e / f;

        System.out.println(result);

        /*
            double  = (double)int/int;
            result
            2.5     = (double)5/2
        */
        int i, j;

        double result2;

        i = 5;
        j = 2;

        result2 = (double) i/j;

        System.out.println(result2);



        //Casting double to integer, without loss of information
        double k;

        int l;

        k = 5.0;

        //l = k; compilation error

        //It needs to be explicit
        l = (int) k;

        System.out.println(l);
    }
}