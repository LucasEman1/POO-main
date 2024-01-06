package IntroducaoaoJava;

import java.util.Scanner;

//Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
//valores reais serão informados pelo usuário.

public class Q2 {
    public static void main(String[] args) {
        double soma = 0.0, media = 0.0;
        double num[] = new double[3];

        System.out.println("Digite três valores: \t");
        Scanner ent = new Scanner(System.in);
        System.out.println("\tValor 1: \t");
        num[0] = ent.nextDouble();

        System.out.println("\tValor 2: \t");
        num[1] = ent.nextDouble();

        System.out.println("\tValor 3: \t");
        num[2] = ent.nextDouble();

        ent.close();

        soma = (num[0] + num[1] + num[2]);
        media = ((num[0] + num[1] + num[2]) / 3);

        System.out.println("Soma> " + soma);
        System.out.println("Media> " + media);
    }
}