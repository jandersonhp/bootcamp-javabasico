/* Escreva um código onde o usuário entra com um número e 
seja gerada a tabuada de 1 até 10 desse número; 
*/
package EstrutCondicional;
import java.util.Scanner;
public class ExTabuada {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numb;
        // Pedir o número
        System.out.println("Informe o número que deseja ver a tabuada");
        numb = scanner.nextInt();

        //Gerar a tabuada de 1 até 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numb + " x " + i + " = " + (numb * i));
        }
        scanner.close();
    }
}
