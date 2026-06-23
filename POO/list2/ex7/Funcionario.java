public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private double bonificacao;

    public Funcionario(String nome, String cpf, double salario, double bonificacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.bonificacao = bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    public double calcularProventosAnuais() {
        return (salario + bonificacao) * 12;
    }

    public String toString() {
        return "Funcionário: " + nome + " | CPF: " + cpf + " | Salário: " + salario + " | Bonificação: " + bonificacao;
    }
}
