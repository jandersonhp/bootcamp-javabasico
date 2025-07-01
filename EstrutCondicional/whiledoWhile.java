package EstrutCondicional;
import java.util.Scanner;
public class whiledoWhile {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var name = "";
        // while if (primeiro verifica a condição, depois executa o código)
        while (true){
            System.out.println("Informe um nome(exit):");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase( "exit")) break;
        }

        // do-while (primeiro executa o código, depois verifica a condição)
        do {
            System.out.println("Informe um nome (sair):");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase( "sair")) break;
        } while (true);
    scanner.close();
    }

    
}
