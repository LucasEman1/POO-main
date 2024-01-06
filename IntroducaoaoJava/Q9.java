import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a carta: ");
        System.out.println(
                "1 = às, 2 = dois, 3 = tres, 4 = quatro, 5 = cinco, 6 = seis \n7 = sete, 8 = oito, 9 = nove, 10 = dez, 11 = valete, 12 = dama, 13 = rei");

        int carta = scanner.nextInt();
        String[] cartas = { "às", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "valete",
                "dama", "rei" };

        System.out.println("Qual o naipe: ");
        System.out.println("1 = ouros, 2 = paus, 3 = copas, 4 = espadas");
        int naipe = scanner.nextInt();
        String[] naipes = { "ouros", "paus", "copas", "espadas" };
        scanner.close();

        System.out.println("" + cartas[carta - 1] + " de " + naipes[naipe - 1]);
    }
}
