public class Aplicativo {
    private String nome;
    private int tamanho;
    private String status;

    public Aplicativo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.status = "Desativado";
    }

    public void iniciarAplicativo() {
        if(this.status.equalsIgnoreCase("Em execução")) {
            System.out.println("O aplicativo já foi iniciado!");
            return;
        }
        this.status = "Em execução";
        System.out.println("Aplicativo " + this.nome + " iniciado.");
    }

    public void pararAplicativo() {
       if(this.status.equalsIgnoreCase("Desativado")) {
            System.out.println("O aplicativo não está em execução!");
        return;
       }
       this.status = "Desativado";
    }

    public void verificarStatus() {
        System.out.println("O aplicativo " + this.nome + " está " + this.status + '.');
    }

    @Override
    public String toString() {
        return "Aplicativo [nome=" + nome + ", tamanho=" + tamanho + ", status=" + status + "]";
    }
}