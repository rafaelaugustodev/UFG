import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Filme implements Serializable {

	private String nome;
	private int ano;
	private String paisOrigem;
	private String lingua;
	private String tipo;
	private List<Artista> artistas;

	public Filme(String nome, int ano, String paisOrigem, String lingua, String tipo) {
		this.nome = nome;
		this.ano = ano;
		this.paisOrigem = paisOrigem;
		this.lingua = lingua;
		this.tipo = tipo;
		this.artistas = new ArrayList<Artista>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getLingua() {
		return lingua;
	}

	public void setLingua(String lingua) {
		this.lingua = lingua;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void adicionarArtista(Artista artista) {
		artistas.add(artista);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + " (" + ano + ") - " + paisOrigem + " - " + lingua + " - " + tipo + "\n");
		if (artistas.isEmpty()) {
			sb.append("    Sem artistas cadastrados.\n");
		} else {
			for (Artista a : artistas) {
				sb.append("    Artista: " + a.toString() + "\n");
			}
		}
		return sb.toString();
	}
}
