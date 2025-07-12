import java.time.OffsetDateTime;
import java.util.Scanner;
public class ExercNmIdd {
    public static void main(String[] args) {
        // OffsetDateTime.now pra pegar a data do pc
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe o ano de nascimento");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Olá, %s sua idade é %s anos \n", name, age);

    }

    
}
