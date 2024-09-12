package br.com.moacyr.b_conditional_structure.a_exercise;

public class Exercise_04 {

    public static void main(String[] args) {

        double price = 34.5;

        double discount;

        if (price < 20.0){

            discount = price * 0.1;
        }
        else{
            discount = price * 0.05;
        }

        //Expressão condicional ternária
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;


    }
}
