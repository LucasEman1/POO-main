import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int num1, num2, num3, menor;
        Scanner num = new Scanner(System.in);

        System.out.println("Digite três numeros: ");
        num1 = num.nextInt();
        num2 = num.nextInt();
        num3 = num.nextInt();
        num.close();

        if (num1 < num2 && num1 < num3) {
            menor = num1;
            System.out.println("O Menor número é o primeiro: " + menor);
        } else if (num2 < num3 && num2 < num1) {
            menor = num2;
            System.out.println("O Menor número é o segundo: " + menor);
        } else if (num3 < num1 && num3 < num2) {
            menor = num3;
            System.out.println("O Menor número é o terceiro: " + menor);
        } else {
            System.out.println("Todos são iguais!" + num1);
        }
    }
}
