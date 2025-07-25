package Aulas.CollectionsStream.SetInterface.Pesquisa;
import java.util.*;

public class AgendaContatos {
    //Atributo
    private Set<Contato> contatoSet;
    //Constructor
    public AgendaContatos() {
    this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
        public static void main(String[] args) {
            System.out.println("");
    // Criando uma instância da classe AgendaContatos
    AgendaContatos agendaContatos = new AgendaContatos();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos.exibirContatos();

    // Adicionando contatos à agenda
    agendaContatos.adicionarContato("João", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Ana", 88889999);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);
    System.out.println("\n \n \n");
    // Exibindo os contatos na agenda
    agendaContatos.exibirContatos();
    System.out.println("");
    // Pesquisando contatos pelo nome
    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    // Atualizando o número de um contato
    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("\nContato atualizado: " + contatoAtualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("\nContatos na agenda após atualização:");
    agendaContatos.exibirContatos();
    }
}
