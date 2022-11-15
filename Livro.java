public class Livro {
    private String titulo;
    private String autor;
    private String codArea;

    public Livro(String titulo, String autor, String codArea) {
        this.titulo = titulo;
        this.autor = autor;
        this.codArea = codArea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }
}
