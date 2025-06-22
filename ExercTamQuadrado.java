/* Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

fórmula: área=lado X lado */

import java.util.Scanner;
public class ExercTamQuadrado{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o tam. do lado de um quadrado: ");
        var lado1 = scanner.nextInt();
        int area = lado1 * lado1;
        // %d = placeholder para numeros inteiros
        // %n = /n (quebra de linha)
        System.out.printf("A área do quadrado é: %d%n", area);
    }

}