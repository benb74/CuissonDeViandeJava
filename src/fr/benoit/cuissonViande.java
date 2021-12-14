package fr.benoit;

import java.util.Scanner;

public class cuissonViande {

    public static void main(String[] args) {

        System.out.println("Bonjour et bienvenue sur le compagnon d'aide à la cuisson de viande !");
        System.out.println("Saisissez 1 pour 500g de boeuf ou 2 pour 400g de porc :");
        Scanner sc = new Scanner(System.in);
        int qteViande = sc.nextInt();


        if (qteViande == 1) {
            System.out.println("Vous avez choisi 500g de boeuf");
            System.out.println("Pour une cuisson Bleue, taper 1, pour une cuisson A Point tapez 2, pour une cuisson Bien cuit taper 3");
            int cuisson = sc.nextInt();
            switch (cuisson) {
                case 1:
                    System.out.println("Pour cuire 500 grammes de bœuf, il faut :\n" +
                            "10 minutes si on le veut BLEU");
                    break;
                case 2:
                    System.out.println("Pour cuire 500 grammes de bœuf, il faut :\n" +
                            "17 minutes si on le veut A POINT");
                    break;
                case 3:
                    System.out.println("Pour cuire 500 grammes de bœuf, il faut :\n" +
                            "25 minutes si on le veut BIEN CUIT");
                    break;
            }
        } else {
            System.out.println("Vous avez choisi 400 de porc");

            System.out.println("Pour une cuisson Bleue, taper 1, pour une cuisson A Point tapez 2, pour une cuisson Bien cuit taper 3");
            int cuisson = sc.nextInt();
            switch (cuisson) {
                case 1:
                    System.out.println("Pour cuire 500 grammes de porc, il faut :\n" +
                            "15 minutes si on le veut BLEU");
                    break;
                case 2:
                    System.out.println("Pour cuire 500 grammes de porc, il faut :\n" +
                            "25 minutes si on le veut A POINT");
                    break;
                case 3:
                    System.out.println("Pour cuire 500 grammes de porc, il faut :\n" +
                            "40 minutes si on le veut BIEN CUIT");
                    break;
            }
        }

    }
}
