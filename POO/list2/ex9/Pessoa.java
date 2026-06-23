public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeIntermediario;

    public Pessoa(String nome, String sobrenome, String nomeIntermediario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeIntermediario = nomeIntermediario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeIntermediario() {
        return nomeIntermediario;
    }

    public String getNomeFormatado() {
        String letraNome = nome != null && !nome.isEmpty() ? nome.substring(0, 1).toUpperCase() : "";
        String letraInterm = nomeIntermediario != null && !nomeIntermediario.isEmpty()
                ? nomeIntermediario.substring(0, 1).toUpperCase() : "";
        return sobrenome.toUpperCase() + ", " + letraNome + ". " + letraInterm + ".";
    }

    public String toString() {
        return getNomeFormatado();
    }
}
