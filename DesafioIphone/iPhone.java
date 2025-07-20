package DesafioIphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Variável para armazenar a música selecionada
    private String musicaSelecionada;

    // Métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando a música: " + musicaSelecionada);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaSelecionada = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    
}
