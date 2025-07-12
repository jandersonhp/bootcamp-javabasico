/*Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)"; */
package EstrutCondicional;
import java.util.Scanner;
public class ExIMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // Variáveis
        int peso;
        double altura;
        double imc;
        // Pedir peso e altura.
        System.out.println("Informe seu peso");
        peso = scanner.nextInt();

        System.out.println("Informe sua altura");
        altura = scanner.nextDouble();
        // Fórmula do IMC
        imc = peso / (altura * altura);
        // If-else if
        if (imc <= 18.5){
            System.out.printf("Seu IMC é: %.2f - Abaixo do peso!", imc);
                } else if (imc <= 24.9) {
            System.out.printf("Seu IMC é: %.2f - Peso ideal", imc);
        } else if (imc <= 29.9){
            System.out.printf("Seu IMC é: %.2f - Levemente acima do peso", imc);
        } else if (imc <= 34.9){
            System.out.printf("Seu IMC é: %.2f - Obesidade Grau I", imc);
        } else if (imc <= 39.9){
            System.out.printf("Seu IMC é: %.2f - Obesidade Grau II (Severa)", imc);
        } else if (imc >= 40){
            System.out.printf("Seu IMC é: %.2f - Obesidade III (Mórbida)", imc);
        }
        scanner.close();
    }
}
