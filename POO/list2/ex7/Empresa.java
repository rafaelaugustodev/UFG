import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void mostrarFuncionarios() {
        System.out.println("=== Empresa: " + nome + " (CNPJ: " + cnpj + ") ===");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println(" -> Proventos anuais: " + f.calcularProventosAnuais());
        }
    }
}
