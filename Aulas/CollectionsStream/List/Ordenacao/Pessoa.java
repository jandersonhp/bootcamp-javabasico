package Aulas.CollectionsStream.List.Ordenacao;
import java.util.*;

public class Pessoa implements Comparable<Pessoa>{

//Atributos
private String nome;
private int idade;
private double altura;
//Constructor
public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
}

    //method compareTo
        @Override
        public int compareTo(Pessoa p) {
            return Integer.compare(idade, p.getIdade());
        }
    //Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    //toString
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
    
    
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2){
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
