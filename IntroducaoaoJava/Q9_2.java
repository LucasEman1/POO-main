import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Q9_2 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        Map<Integer, String> naipes = new HashMap<>();
        naipes.put(1, "paus");
        naipes.put(2, "ouros");
        naipes.put(3, "copas");
        naipes.put(4, "espadas");
        scanner.close();

        System.out.println(naipes);
    }
}
