package dominio;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private String cor;
    private int capacidade;

    public Iphone(String modelo, String cor, int capacidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina de " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizar() {
        System.out.println("Janela atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Parar a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Ouvindo a musica " + musica);
    }

    @Override
    public String toString() {
        return modelo 
                + ", Cor: "
                + cor
                + ", Capacidade: "
                + capacidade;
    }
    
}
