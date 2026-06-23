public class Filme extends Item {
    private String diretor;

    public Filme(String titulo, int ano, int tempoDuracao, String comentarios, String diretor) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String dadosEspecificos() {
        return "Diretor: " + diretor;
    }

    public String toString() {
        return "[Filme] " + dadosComuns() + " | " + dadosEspecificos();
    }
}
