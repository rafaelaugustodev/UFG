public class Aluno {
    private String nome;
    private String matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, String matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome +
                " | Matrícula: " + matricula +
                " | Ano: " + ano +
                " | Curso: " + curso;
    }
}
