import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SalaCinema implements Serializable {

	private int numero;
	private String nome;
	private String localizacao;
	private List<Filme> filmes;

	public SalaCinema(int numero, String nome, String localizacao) {
		this.numero = numero;
		this.nome = nome;
		this.localizacao = localizacao;
		this.filmes = new ArrayList<Filme>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void adicionarFilme(Filme filme) {
		filmes.add(filme);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sala " + numero + " - " + nome + " (" + localizacao + ")\n");
		if (filmes.isEmpty()) {
			sb.append("  Nenhum filme em exibicao.\n");
		} else {
			for (Filme f : filmes) {
				sb.append("  Filme: " + f.toString());
			}
		}
		return sb.toString();
	}
}
