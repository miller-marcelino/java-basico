public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos para o Reprodutor Musical
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }
    
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    // Implementação dos métodos para o Aparelho Telefônico
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero);
    }

    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero);
    }

    // Implementação dos métodos para o Navegador na Internet
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void fecharPagina() {
        System.out.println("Fechando página");
    }

    // Exemplo de utilização
    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone();
        
        meuiPhone.tocarMusica("Bohemian Rhapsody");
        meuiPhone.fazerChamada("123456789");
        meuiPhone.abrirPagina("www.google.com");
    }
}