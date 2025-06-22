/* Pedir número de conta, agência, nome do cliente e o saldo 
  Imprimir a seguinte mensagem no final:
  "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários. */
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        // Pedindo nome, reposta em texto
        System.out.print("Olá, por favor, iforme seu nome: ");
        var name = scanner.nextLine();

        // Pedindo numero da conta, reposta em num inteiro
        System.out.print("Agora informe o número de sua conta: ");
        var numero = scanner.nextInt();
        scanner.nextLine(); // tava dando erro, coloquei um scanner.nextLine pra limpar o buffer

        // Pedindo agência, resposta em texto
        System.out.print("Informe a agência do banco: ");
        var agencia = scanner.nextLine();

        // Pedindo saldo, resposta em numero decimal
        System.out.print("Quanto de saldo possui (Favor, utilizar vírgula em vez de ponto.): ");
        var saldo = scanner.nextDouble();
        

        // Imprimir a mensagem pedida no desafio
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", name, agencia, numero, saldo);
        // Place holders /\ %s para string, %d para numero inteiro e %.2f para decimais com duas casas
        scanner.close();
    
    }
}
