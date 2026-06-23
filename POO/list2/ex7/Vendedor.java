public class Vendedor extends Funcionario {
    private double[] vendas;
    private double percentualComissao;

    public Vendedor(String nome, String cpf, double salario, double bonificacao, double percentualComissao) {
        super(nome, cpf, salario, bonificacao);
        this.vendas = new double[12];
        this.percentualComissao = percentualComissao;
    }

    public double[] getVendas() {
        return vendas;
    }

    public void setVendaMes(int mes, double valor) {
        if (mes >= 0 && mes < 12) {
            vendas[mes] = valor;
        }
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularProventosAnuais() {
        double total = super.calcularProventosAnuais();
        for (double v : vendas) {
            total += v * (percentualComissao / 100.0);
        }
        return total;
    }

    public String toString() {
        return "[Vendedor] " + super.toString() + " | Comissão: " + percentualComissao + "%";
    }
}
