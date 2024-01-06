package IntroducaoaoJava;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        double lado, area = 0.0;
        System.out.println("Digite o valor do lado do quadrado: ");
        Scanner entrada = new Scanner(System.in);
        lado = entrada.nextDouble();
        entrada.close();
        area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
    }
}
