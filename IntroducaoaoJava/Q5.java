import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int n1, n2, n3, number, assist;

        System.out.println("Digite 3 numeoros: ");
        Scanner num = new Scanner(System.in);
        number = num.nextInt();
        num.close();
        System.out.println("//");
        // 456
        n1 = number / 100;
        assist = number - (n1 * 100);
        n2 = assist / 10;
        n3 = number - (n1 * 100) + (n2 * 10);
        n3 = n3 - 100;
        assist = (n3 * 100) + (n2 * 10) + n1;
        System.out.println("Invertido: " + assist);

    }

}
