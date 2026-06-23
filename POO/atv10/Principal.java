import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao = 0;

		do {
			System.out.println("\n===== AGENDA =====");
			System.out.println("1 - Criar agenda");
			System.out.println("2 - Mostrar agenda");
			System.out.println("3 - Marcar consulta");
			System.out.println("0 - Sair");
			System.out.print("Opção: ");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.print("Dia: ");
				int dia = sc.nextInt();
				System.out.print("Mês: ");
				int mes = sc.nextInt();
				System.out.print("Ano: ");
				int ano = sc.nextInt();
				System.out.print("Hora inicial: ");
				int hora = sc.nextInt();
				System.out.print("Minuto inicial: ");
				int min = sc.nextInt();
				System.out.print("Quantidade de consultas: ");
				int qtde = sc.nextInt();

				Data data = new Data(dia, mes, ano, hora, min, qtde);
				agenda.adicionarData(data);
				System.out.println("Agenda criada para o dia " + dia + "/" + mes + "/" + ano
						+ " com " + qtde + " horários a partir de " + hora + ":" + min + ".");

			} else if (opcao == 2) {
				System.out.println();
				System.out.print(agenda.toString());

			} else if (opcao == 3) {
				System.out.print("Dia: ");
				int dia = sc.nextInt();
				System.out.print("Mês: ");
				int mes = sc.nextInt();
				System.out.print("Ano: ");
				int ano = sc.nextInt();
				System.out.print("Hora: ");
				int hora = sc.nextInt();
				System.out.print("Minuto: ");
				int min = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome do cliente: ");
				String nome = sc.nextLine();
				System.out.print("Telefone do cliente: ");
				String telefone = sc.nextLine();

				Cliente cliente = new Cliente(nome, telefone);
				agenda.marcarConsulta(dia, mes, ano, hora, min, cliente);
			}

		} while (opcao != 0);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("agenda.dat"));
			out.writeObject(agenda);
			out.close();
			System.out.println("Agenda gravada no arquivo agenda.dat");
		} catch (Exception e) {
			System.out.println("Erro ao gravar a agenda: " + e.getMessage());
		}

		sc.close();
	}
}
