public class Livro {
    private String titulo;
    private int codigo;
    private Pessoa autor;
    private String editora;
    private int edicao;
    private int ano;
    private String local;
    private String genero;

    private static int totalLivros = 0;

    public Livro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        totalLivros++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static int getTotalLivros() {
        return totalLivros;
    }

    public String toString() {
        return "Código: " + codigo + "\n" +
                "Título: " + titulo + "\n" +
                "Gênero : " + genero + "\n" +
                "Referência : " + autor + " " + titulo + ". " + edicao + "a. edição. " + local + ": " + editora + ", " + ano + ".";
    }
}
