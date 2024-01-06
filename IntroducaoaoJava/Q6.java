import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int tempo, dias, horas, minutos, seg;
        System.out.println("Digite um valor em minutos: ");
        Scanner valor = new Scanner(System.in);
        tempo = valor.nextInt();
        valor.close();
        dias = (tempo / 1440);
        horas = ((tempo % 1440) / 60);
        seg = (tempo % 1440) - (dias * 100);
        minutos = (seg);
        System.out.println(dias + " Dias/ " + horas + " Horas/ " + minutos + " Minutos");
    }
}
