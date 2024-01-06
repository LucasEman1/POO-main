package IntroducaoaoJava;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        int n;
        Scanner ent = new Scanner(System.in);
        n = ent.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(fatorial(i, 0));
        }
    }

    public static int fatorial(int n, int nivel) {
        if (n == 0) {
            System.out.println(nivel + "! = 1");
            return 1;
        } else {
            System.out.println(nivel + "! = \t" + n + " * " + (n - 1) + "!\t");
            int resultado = n * fatorial(n - 1, nivel + 1);
            System.out.println(nivel + "! = " + resultado);
            return resultado;
        }
    }
}
