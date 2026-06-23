public class TesteCinema {

	private static int passou = 0;
	private static int falhou = 0;

	public static void main(String[] args) {
		testAdicionarFilme();
		testAdicionarVariosFilmes();
		testAdicionarArtista();
		testAdicionarVariosArtistas();

		System.out.println("\n===== RESULTADO =====");
		System.out.println("Passou: " + passou);
		System.out.println("Falhou: " + falhou);
	}

	private static void testAdicionarFilme() {
		SalaCinema sala = new SalaCinema(1, "Sala VIP", "Piso 2");
		Filme filme = new Filme("Matrix", 1999, "EUA", "Ingles", "Ficcao");
		sala.adicionarFilme(filme);

		verifica("testAdicionarFilme - quantidade", sala.getFilmes().size() == 1);
		verifica("testAdicionarFilme - filme correto", sala.getFilmes().get(0) == filme);
	}

	private static void testAdicionarVariosFilmes() {
		SalaCinema sala = new SalaCinema(2, "Sala 2", "Piso 1");
		sala.adicionarFilme(new Filme("Filme A", 2001, "Brasil", "Portugues", "Drama"));
		sala.adicionarFilme(new Filme("Filme B", 2010, "Franca", "Frances", "Comedia"));
		sala.adicionarFilme(new Filme("Filme C", 2020, "Japao", "Japones", "Animacao"));

		verifica("testAdicionarVariosFilmes - quantidade", sala.getFilmes().size() == 3);
		verifica("testAdicionarVariosFilmes - nome do segundo", sala.getFilmes().get(1).getNome().equals("Filme B"));
	}

	private static void testAdicionarArtista() {
		Filme filme = new Filme("Matrix", 1999, "EUA", "Ingles", "Ficcao");
		Artista artista = new Artista("Keanu Reeves", 35, "Canadense");
		filme.adicionarArtista(artista);

		verifica("testAdicionarArtista - quantidade", filme.getArtistas().size() == 1);
		verifica("testAdicionarArtista - artista correto", filme.getArtistas().get(0) == artista);
	}

	private static void testAdicionarVariosArtistas() {
		Filme filme = new Filme("Vingadores", 2012, "EUA", "Ingles", "Acao");
		filme.adicionarArtista(new Artista("Robert", 49, "Americano"));
		filme.adicionarArtista(new Artista("Scarlett", 28, "Americana"));

		verifica("testAdicionarVariosArtistas - quantidade", filme.getArtistas().size() == 2);
		verifica("testAdicionarVariosArtistas - nome do primeiro", filme.getArtistas().get(0).getNome().equals("Robert"));
	}

	private static void verifica(String nome, boolean condicao) {
		if (condicao) {
			passou++;
			System.out.println("[PASSOU] " + nome);
		} else {
			falhou++;
			System.out.println("[FALHOU] " + nome);
		}
	}
}
