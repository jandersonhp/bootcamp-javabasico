import java.util.Scanner;
public class Main {
    /* Trabalhando com Operadores [...]
     * Parei aos 19 minutos
     */
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Qual é sua idade?");
        var idade  = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = idade >= 18 || isEmancipated;
        System.out.printf("Você pode dirigir? %s \n", canDrive);
    scanner.close();
    }
    

}