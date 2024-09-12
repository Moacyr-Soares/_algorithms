package br.com.moacyr.c_repetitive_structures.c_challenge;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_JavaAthletes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int numberOfAthletes, maximumLock = 0, women = 0;

        String name = null, tallestAthlete = null;

        double numerator = 0, height, weight, totalweight = 0, max=0, heightWomen = 0, averageHeightWomen;

        char gender = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");

        numberOfAthletes = sc.nextInt();

        sc.nextLine();

        double [] vet = new double[numberOfAthletes];

        for (int i = 1; i <= numberOfAthletes; i++) {

            System.out.printf("Digite os dados do atleta numero %d:%n", i);

            System.out.print("Nome: ");

            name = sc.nextLine();

            System.out.print("Sexo: ");

            gender = sc.nextLine().charAt(0);


            while (gender != 'F' && gender != 'M'){

                System.out.print("Valor invalido! Favor digitar F ou M: ");

                gender = sc.next().charAt(0);
            }

            if (gender == 'M'){

                numerator ++;
            }

            System.out.print("Altura: ");

            height = sc.nextDouble();

            while (height <= 0.0) {

                System.out.print("Valor invalido! Favor digitar um valor positivo: ");

                height = sc.nextDouble();

                sc.nextLine();
            }
            if (gender == 'F'){

                heightWomen += height;
                
                women ++;
                
            }

            vet[i - 1] = height;

            if (maximumLock < 1){

                max = vet[0];
                
            }
            
                if (vet[i -1] >= max){

                    max = vet[i -1];

                    tallestAthlete = name;
                }

            System.out.print("Peso: ");

            weight = sc.nextDouble();

            sc.nextLine();

            while (weight <= 0){

                System.out.print("Valor invalido! Favor digitar um valor positivo ");

                weight = sc.nextDouble();

                sc.nextLine();
            }

            totalweight += weight;

            maximumLock ++;
        }

        double percentageMen = (numerator/ numberOfAthletes) * 100;

        System.out.println();

        System.out.println("RELATÓRIO:");

        double mediumWeight = totalweight / numberOfAthletes;

        System.out.printf("Peso médio dos atletas: %.2f%n", mediumWeight);

        System.out.printf("Atleta mais alto: %s %n", tallestAthlete);

        if (percentageMen > 0.0){

            System.out.printf("Porcentagem de homens: %.1f %% %n", percentageMen);
        }

        if (percentageMen == 100.0){

            System.out.println("Não há mulheres cadastradas ");
        }
        
        if (women > 0){

           averageHeightWomen = heightWomen / women;

            System.out.printf("Altura média das mulheres: %.2f%n ", averageHeightWomen);
        }
        
            sc.close();
        }
    }