public class Empregado {
    private String nome;
    private String matricula;
    private Empresa empresa;

    public Empregado(String nome, String matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empregado: " + nome +
                " | Matrícula: " + matricula +
                " | Empresa: " + empresa;
    }
}
