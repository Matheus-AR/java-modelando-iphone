import dominio.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone1 = new Iphone("Iphone 11", "Branco", 32);

        System.out.println("Usando as funções do Iphone");
        System.out.println(iphone1.toString() + "\n");

        System.out.println("Usando o reprodutor de música");
        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusica("Música qualquer");

        System.out.println("\nUsando as funções de telefone");
        iphone1.ligar("21 9 9922-2333");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();

        System.out.println("\nUsando as funções de navegador de internet");
        iphone1.exibirPagina("www.google.com");
        iphone1.adicionarNovaAba();
        iphone1.atualizar();

    }
}
