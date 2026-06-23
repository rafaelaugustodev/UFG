import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<SalaCinema> salas = new ArrayList<SalaCinema>();

		String continuarSala = "s";
		while (continuarSala.equalsIgnoreCase("s")) {
			System.out.print("Numero da sala: ");
			int numero = Integer.parseInt(sc.nextLine());
			System.out.print("Nome da sala: ");
			String nomeSala = sc.nextLine();
			System.out.print("Localizacao da sala: ");
			String localizacao = sc.nextLine();

			SalaCinema sala = new SalaCinema(numero, nomeSala, localizacao);

			String continuarFilme = "s";
			while (continuarFilme.equalsIgnoreCase("s")) {
				System.out.print("Nome do filme: ");
				String nomeFilme = sc.nextLine();
				System.out.print("Ano do filme: ");
				int ano = Integer.parseInt(sc.nextLine());
				System.out.print("Pais de origem: ");
				String pais = sc.nextLine();
				System.out.print("Lingua: ");
				String lingua = sc.nextLine();
				System.out.print("Tipo: ");
				String tipo = sc.nextLine();

				Filme filme = new Filme(nomeFilme, ano, pais, lingua, tipo);

				String continuarArtista = "s";
				while (continuarArtista.equalsIgnoreCase("s")) {
					System.out.print("Nome do artista: ");
					String nomeArtista = sc.nextLine();
					System.out.print("Idade do artista: ");
					int idade = Integer.parseInt(sc.nextLine());
					System.out.print("Nacionalidade do artista: ");
					String nacionalidade = sc.nextLine();

					Artista artista = new Artista(nomeArtista, idade, nacionalidade);
					filme.adicionarArtista(artista);

					System.out.print("Adicionar outro artista a este filme? (s/n): ");
					continuarArtista = sc.nextLine();
				}

				sala.adicionarFilme(filme);

				System.out.print("Adicionar outro filme a esta sala? (s/n): ");
				continuarFilme = sc.nextLine();
			}

			salas.add(sala);

			System.out.print("Cadastrar outra sala de cinema? (s/n): ");
			continuarSala = sc.nextLine();
		}

		System.out.println("\n===== DADOS CADASTRADOS =====");
		for (SalaCinema sala : salas) {
			System.out.print(sala.toString());
		}

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("salas.dat"));
			out.writeObject(salas);
			out.close();
			System.out.println("\nDados gravados no arquivo salas.dat");
		} catch (Exception e) {
			System.out.println("Erro ao gravar os dados: " + e.getMessage());
		}

		try {
			java.io.PrintWriter pw = new java.io.PrintWriter(new FileOutputStream("salas.txt"));
			for (SalaCinema sala : salas) {
				pw.print(sala.toString());
			}
			pw.close();
			System.out.println("Dados gravados no arquivo salas.txt");
		} catch (Exception e) {
			System.out.println("Erro ao gravar o arquivo texto: " + e.getMessage());
		}

		sc.close();
	}
}
