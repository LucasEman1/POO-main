import java.lang.Math;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double ang, rad;
        System.out.println("Digite um angulo: ");
        Scanner ler = new Scanner(System.in);
        ang = ler.nextDouble();
        rad = Math.toRadians(ang);
        ler.close();

        System.out.println("\tEm Radiano: " + rad);
        System.out.println("\tSeno: " + Math.sin(rad));
        System.out.println("\tCosseno: " + Math.cos(rad));
        System.out.println("\tTangente: " + Math.tan(rad));
        System.out.println("\tCossecante: " + 1.0 / Math.cos(rad));
        System.out.println("\tSecante: " + 1.0 / Math.sin(rad));
        System.out.println("\tCotangente: " + 1.0 / Math.tan(rad));

    }
}
