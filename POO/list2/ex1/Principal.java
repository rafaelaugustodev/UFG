public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva");
        aluno.matricular(2025001, "Engenharia de Software", 2025);
        System.out.println(aluno);

        aluno.setCurso("Ciência da Computação");
        aluno.setAno(2026);
        System.out.println(aluno);
    }
}
