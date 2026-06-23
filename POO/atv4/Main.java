public class Main {
    public static void main(String[] args) {

        System.out.println("=== MÚSICAS ===");
        Compositor c1 = new Compositor("Chico Buarque", "Brasileira");
        Compositor c2 = new Compositor("John Lennon", "Britânica");

        Musica m1 = new Musica("Construção", 1971, "MPB", c1);
        Musica m2 = new Musica("Imagine", 1971, "Rock", c2);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("\n=== ALUNOS ===");
        Departamento d = new Departamento("Computação", "CC");
        Curso curso = new Curso("SI", "SI", d);

        Aluno a1 = new Aluno("Carlos", "001", 2024, curso);
        System.out.println(a1);

        System.out.println("\n=== CLIENTES ===");
        Endereco e1 = new Endereco("Rua A", 10, "Casa", "00000-000",
                "Centro", "Goiânia", "GO");

        Cliente cliente = new Cliente("Lucas", "123", e1);
        System.out.println(cliente);

        System.out.println("\n=== EMPREGADOS ===");
        Empresa emp = new Empresa("Tech LTDA", "111", e1);
        Empregado empregado = new Empregado("João", "EMP1", emp);

        System.out.println(empregado);
    }
}
