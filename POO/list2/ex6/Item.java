public class Item {
    private String titulo;
    private int ano;
    private int tempoDuracao;
    private String comentarios;

    public Item(String titulo, int ano, int tempoDuracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.tempoDuracao = tempoDuracao;
        this.comentarios = comentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String dadosComuns() {
        return "Título: " + titulo + " | Ano: " + ano + " | Duração: " + tempoDuracao + " min | Comentários: " + comentarios;
    }

    public String toString() {
        return dadosComuns();
    }
}
