package EstrutCondicional;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        var name = scanner.nextLine();

        System.out.print("Informe sua idade: ");
        var age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Você é emancipado? (S/N): ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%n%s tem %s anos, já pode dirigir %n", name, age);

        }

        else if (age >= 16 && isEmancipated){
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir. \n", name, age);

        }

        else {
            System.out.printf("%n%s, você não pode dirigir \n", name);

        }
        
        System.out.println("Fim da execução.");

        scanner.close();

    }

}