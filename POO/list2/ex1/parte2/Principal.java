public class Principal {
    public static void main(String[] args) {
        Curso cursoES = new Curso("ES", "Engenharia de Software");
        Curso cursoCC = new Curso("CC", "Ciência da Computação");

        Aluno aluno = new Aluno("João Silva");
        aluno.matricular(2025001, cursoES, 2025);
        System.out.println(aluno);

        aluno.setCurso(cursoCC);
        aluno.setAno(2026);
        System.out.println(aluno);
    }
}
