public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String cpf, double salario, double bonificacao, String departamento) {
        super(nome, cpf, salario, bonificacao);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return "[Gerente] " + super.toString() + " | Departamento: " + departamento;
    }
}
