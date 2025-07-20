package Aulas.CollectionsStream.List.Ordenacao;
import java.util.*;

public class OrdenacaoPessoa {
    //Atributo
    private List<Pessoa> pessoaList;

    //Construtor
    public OrdenacaoPessoa() {
        this.pessoaList = pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

        public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        System.out.println("");

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa( "Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa( "Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa( "Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa( "Nome 4", 17, 1.56);
    
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

        System.out.println("");
        System.out.println(ordenacaoPessoa.pessoaList);
    }
}
