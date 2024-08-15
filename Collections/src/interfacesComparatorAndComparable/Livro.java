package interfacesComparatorAndComparable;

import java.util.Comparator;

public class Livro implements Comparable<Livro> {

    private String titulo;
    private String autor;
    private int ano;

    public Livro(String ti, String au, int an) {
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }

    @Override
    public int compareTo(Livro livro) {
        return titulo.compareTo(livro.titulo);
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return this.ano;
    }
}

class CompararAutor implements Comparator<Livro> {

    @Override
    public int compare(Livro livro1, Livro livro2) {
        return livro1.getAutor().compareTo(livro2.getAutor());
    }
}

class CompararAno implements Comparator<Livro> {

    @Override
    public int compare(Livro livro1, Livro livro2) {
        if(livro1.getAno() < livro2.getAno()) return -1;
        if(livro1.getAno() > livro2.getAno()) return 1;
        return 0;
    }
}

class CompararAnoAutorTitulo implements Comparator<Livro> {

    @Override
    public int compare(Livro livro1, Livro livro2) {
        int ano = Integer.compare(livro1.getAno(), livro2.getAno());
        if(ano != 0) return ano;
        int autor = livro1.getAutor().compareTo(livro2.getAutor());
        if(autor != 0) return autor;
        return livro1.getTitulo().compareTo(livro2.getTitulo());
    }
}