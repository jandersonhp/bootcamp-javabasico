/*Escreva um código que o usuário entre com um primeiro 
número, um segundo número maior que o primeiro e escolhe 
entre a opção par e impar, com isso o código deve informar 
todos os números pares ou ímpares (de acordo com a seleção 
inicial) no intervalo de números informados, incluindo os 
números informados e em ordem decrescente; */
package EstrutCondicional;
import java.util.Scanner;
public class ExParImpar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        //Variáveis
        int num1;
        int num2;
        var opcao = "";
        //Entradas do usuário
        System.out.println("Insira o primeiro número");
        num1 = scanner.nextInt();

        System.out.println("Insira o segundo número");
        num2 = scanner.nextInt();

        //Validar se num 2 é maior que o numero 1
        if (num2 <= num1){
            scanner.close();
            System.out.println("O segundo número deve ser maior que o primeiro.");
            return;
            
            
        }
scanner.close();
        System.out.println("Escolha entre par ou impar para ver os números equivalentes no intervalo dos dois números escolhidos");
        //scanner.nextLine pra limpar o buffer após o nextInt
        scanner.nextLine();
        opcao = scanner.nextLine();

        //Verificar se é par ou impar e imprimir o resultado
        for (int i = num2; i >= num1; i--){
            if (opcao.equalsIgnoreCase("par") && i % 2 == 0){
                System.out.println(i);
            } else if (opcao.equalsIgnoreCase("impar") && i % 2 != 0){
                System.out.println(i);
            }

        }

        scanner.close();
    }
}
