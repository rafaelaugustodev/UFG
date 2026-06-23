import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Gerente> gerentes = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            funcionarios.add(new Funcionario("Func" + i, "000.000.00" + i + "-00", 2000.0 + i * 100, 200.0));
        }
        for (int i = 1; i <= 2; i++) {
            gerentes.add(new Gerente("Gerente" + i, "111.111.11" + i + "-11", 5000.0 + i * 500, 800.0, "Dept" + i));
        }
        for (int i = 1; i <= 5; i++) {
            Vendedor v = new Vendedor("Vendedor" + i, "222.222.22" + i + "-22", 1500.0 + i * 100, 150.0, 5.0);
            for (int m = 0; m < 12; m++) {
                v.setVendaMes(m, 3000.0 + m * 100);
            }
            vendedores.add(v);
        }

        System.out.println("=== Dados antes do aumento ===");
        mostrarTodos(funcionarios, gerentes, vendedores);

        for (Funcionario f : funcionarios) f.aumentarSalario(10);
        for (Gerente g : gerentes) g.aumentarSalario(10);
        for (Vendedor v : vendedores) v.aumentarSalario(10);

        System.out.println("\n=== Dados após aumento de 10% ===");
        mostrarTodos(funcionarios, gerentes, vendedores);

        System.out.println("\n=== Cadastro usando classe Empresa ===");
        Empresa empresa = new Empresa("12.345.678/0001-00", "Tech Corp");
        for (Funcionario f : funcionarios) empresa.adicionarFuncionario(f);
        for (Gerente g : gerentes) empresa.adicionarFuncionario(g);
        for (Vendedor v : vendedores) empresa.adicionarFuncionario(v);
        empresa.mostrarFuncionarios();
    }

    private static void mostrarTodos(List<Funcionario> fs, List<Gerente> gs, List<Vendedor> vs) {
        for (Funcionario f : fs) {
            System.out.println(f + " | Proventos anuais: " + f.calcularProventosAnuais());
        }
        for (Gerente g : gs) {
            System.out.println(g + " | Proventos anuais: " + g.calcularProventosAnuais());
        }
        for (Vendedor v : vs) {
            System.out.println(v + " | Proventos anuais: " + v.calcularProventosAnuais());
        }
    }
}
