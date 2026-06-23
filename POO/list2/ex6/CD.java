public class CD extends Item {
    private String artista;
    private int quantidadeFaixas;

    public CD(String titulo, int ano, int tempoDuracao, String comentarios, String artista, int quantidadeFaixas) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    public void setQuantidadeFaixas(int quantidadeFaixas) {
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public String dadosEspecificos() {
        return "Artista: " + artista + " | Faixas: " + quantidadeFaixas;
    }

    public String toString() {
        return "[CD] " + dadosComuns() + " | " + dadosEspecificos();
    }
}
