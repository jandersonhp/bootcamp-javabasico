package Aulas.CollectionsStream.SetInterface.Pesquisa;

public class Contato {
    //Atributos
    private String nome;
    private int numero;
    //Constructor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    
    //Getters
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return numero;
    }

    //hashCode and equals

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    //toString
    @Override
    public String toString() {
        return "{" + nome + ", " + numero + "}";
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
}
