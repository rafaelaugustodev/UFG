public class Pessoa {

	private String nome;
	private double salario;
	private int dependentes;
	private int idade;

	private static final double DEDUCAO_POR_DEPENDENTE = 179.71;
	private static final int IDADE_ISENCAO = 65;

	public Pessoa(String nome, double salario, int dependentes, int idade) {
		this.nome = nome;
		this.salario = salario;
		this.dependentes = dependentes;
		this.idade = idade;
	}

	public double calculaImposto() {

		if (idade >= IDADE_ISENCAO) {
			return 0.0;
		}

		double imposto;

		if (salario <= 1787.77) {
			imposto = 0.0;
		} else if (salario <= 2679.29) {
			imposto = salario * 0.075 - 134.08;
		} else if (salario <= 3572.43) {
			imposto = salario * 0.15 - 335.03;
		} else if (salario <= 4463.81) {
			imposto = salario * 0.225 - 602.96;
		} else {
			imposto = salario * 0.275 - 826.15;
		}

		imposto = imposto - (dependentes * DEDUCAO_POR_DEPENDENTE);

		if (imposto < 0) {
			imposto = 0.0;
		}

		return imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
