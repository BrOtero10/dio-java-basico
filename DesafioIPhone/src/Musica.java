import java.time.Duration;

public class Musica {
    private String nome;
    private String autor;
    private String album;
    private Duration duracao;
    
    public Musica(String nome, String autor, String album, Duration duracao) {
        this.nome = nome;
        this.autor = autor;
        this.album = album;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    public Duration getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Musica [nome=" + nome + ", autor=" + autor + ", album=" + album + ", duracao=" + duracao + "]";
    }
}