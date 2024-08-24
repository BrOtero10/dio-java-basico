public class IPhone implements AparelhoEletronico, NavegadorInternet, ReprodutorMusical {

    private String numero;
    private Musica musicaSelecionada = null;

    public IPhone(String numero) {
        this.numero = numero;
    }

    @Override
    public void tocarMusica(Musica musica) {
        if(this.musicaSelecionada != null) {
            System.out.println("Tocando: " + musica);
        }
    }

    @Override
    public void pausar() {
        if(this.musicaSelecionada != null) {
            System.out.println("Musica pausada.");;
        }
        else {
            System.out.println("Nenhuma musica selecionada!");
        }
    }

    @Override
    public void selecionarMusica(Musica musica) {
        this.musicaSelecionada = musica;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: [ " + url + " ].");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public String getNumero() {
        return numero;
    }

    public Musica getMusicaSelecionada() {
        return musicaSelecionada;
    }
}
