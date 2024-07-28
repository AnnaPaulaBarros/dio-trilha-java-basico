public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void reproduzirMusica(String nomeMusica) {
        System.out.println("Reproduzindo música: " + nomeMusica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Chamada desligada.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        
        // Testando Reprodutor Musical
        meuIPhone.reproduzirMusica("Minha Música Favorita");
        meuIPhone.pausar();
        meuIPhone.parar();
        
        // Testando Aparelho Telefônico
        meuIPhone.fazerChamada("123456789");
        meuIPhone.atenderChamada();
        meuIPhone.desligarChamada();
        
        // Testando Navegador de Internet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba("https://www.example.com");
        meuIPhone.atualizarPagina();
    }
}
