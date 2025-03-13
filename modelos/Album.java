package modelos;

public class Album {

    private String nomeAalbum;
    private String nomeMusica;
    private String autor;
    private String cantor;

    public Album(String nomeAalbum, String nomeMusica, String autor, String cantor) {
        this.nomeAalbum = nomeAalbum;
        this.nomeMusica = nomeMusica;
        this.autor = autor;
        this.cantor = cantor;
    }

    public String getNomeAalbum() {
        return nomeAalbum;
    }

    public void setNomeAalbum(String nomeAalbum) {
        this.nomeAalbum = nomeAalbum;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
}
