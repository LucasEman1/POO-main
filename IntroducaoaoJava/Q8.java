import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int cod;
        double produto, prodesconto;
        String cod1 = "Setor de Cama, mesa e banho", cod2 = "Setor de eletros";
        System.out.println("PROMOCAO RELAMPAGO!");

        System.out.println("Digite o codigo do setor: ");
        Scanner codtemp = new Scanner(System.in);
        cod = codtemp.nextInt();

        if (cod == 111) {
            System.out.println("Qual o valor do produto: ");
            produto = codtemp.nextDouble();
            codtemp.close();

            if (produto > 500) {
                prodesconto = desconto(produto, 0.1);
                System.out.println(cod1);
                System.out.println("O Preço do produto com desconto é: " + prodesconto);
            } else {
                System.out.println("\t" + cod1 + "\t");
                System.out.println("\nO Produto custa: " + produto + "R$");
            }

        } else if (cod == 222) {
            System.out.println("\nQual o valor do produto: ");
            produto = codtemp.nextDouble();
            codtemp.close();

            if (produto > 100) {
                prodesconto = desconto(produto, 0.4);
                System.out.println(cod2);
                System.out.println("O Preço do produto com desconto é: " + prodesconto);
            }

            else if ((produto > 50) && (produto < 100)) {
                prodesconto = desconto(produto, 0.2);
                System.out.println(cod2);
                System.out.println("O Preço do produto com desconto é: " + prodesconto);
            }

            else if (produto < 50) {
                prodesconto = desconto(produto, 0.1);
                System.out.println(cod2);
                System.out.println("O Preço do produto com desconto é: " + prodesconto);
            }

        } else if ((cod != 111) || (cod != 222)) {
            System.out.println("Setor inválido");
        }
    }

    public static double desconto(double valor, double desconto) {
        double novovalor;

        novovalor = valor - (valor * desconto);

        return (novovalor);
    }
}