/* Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas */
import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe a idade da primeira pessoa: ");
        var p1 = scanner.nextInt();
        System.out.print("Informe a idade da segunda pessoa: ");
        var p2 = scanner.nextInt();
        // variavel diferença, porém pode dar número negativo
        var diferenca = p1 - p2;
        System.out.printf("A diferença de idade é de: %d%n ", diferenca);
        // Math.abs pra não dar número negativo
        System.out.printf("A diferença de idade é de: %d%n", Math.abs(p1 - p2));
    }
}
