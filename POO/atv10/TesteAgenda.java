import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteAgenda {

	public static void main(String[] args) throws Exception {
		Agenda agenda = new Agenda();

		Data data = new Data(3, 2, 2015, 7, 30, 10);
		agenda.adicionarData(data);

		System.out.println(">> Opção 1 - criar agenda");
		System.out.println("Agenda criada para o dia 3/2/2015 com 10 horários a partir de 7:30.");
		System.out.println();

		System.out.println(">> Opção 2 - mostrar agenda");
		System.out.print(agenda.toString());

		System.out.println(">> Opção 3 - marcar consulta (sucesso)");
		agenda.marcarConsulta(3, 2, 2015, 8, 0, new Cliente("João", "9999-0000"));

		System.out.println(">> Opção 3 - marcar consulta (horário ocupado)");
		agenda.marcarConsulta(3, 2, 2015, 8, 0, new Cliente("Maria", "8888-1111"));

		System.out.println(">> Opção 3 - data não encontrada");
		agenda.marcarConsulta(1, 1, 2020, 8, 0, new Cliente("Ana", "7777-2222"));

		System.out.println(">> Opção 3 - horário não encontrado");
		agenda.marcarConsulta(3, 2, 2015, 23, 0, new Cliente("Ana", "7777-2222"));

		System.out.println();
		System.out.println(">> Agenda após marcar consulta:");
		System.out.print(agenda.toString());

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("agenda.dat"));
		out.writeObject(agenda);
		out.close();
		System.out.println(">> Agenda gravada em agenda.dat");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("agenda.dat"));
		Agenda lida = (Agenda) in.readObject();
		in.close();
		System.out.println(">> Agenda lida do arquivo:");
		System.out.print(lida.toString());
	}
}
