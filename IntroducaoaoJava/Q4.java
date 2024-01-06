import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double graus, f;

        System.out.println("Digite um valor em graus: ");
        Scanner ent = new Scanner(System.in);
        graus = ent.nextDouble();
        ent.close();
        f = ((graus * 1.8) + 32);
        System.out.println("Transformado em Fahrenheit: " + f);

    }
}
