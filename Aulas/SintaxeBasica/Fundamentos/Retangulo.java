/* Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

fórmula: área=base X altura */
import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe a base do retângulo: ");
        var base = scanner.nextInt();
        System.out.print("Informe a altura do retângulo: ");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("Area do retângulo: %d%n", area);
    scanner.close();
    }

}