import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Agenda implements Serializable {

	private List<Data> datas;

	public Agenda() {
		this.datas = new ArrayList<Data>();
	}

	public void adicionarData(Data data) {
		datas.add(data);
	}

	public List<Data> getDatas() {
		return datas;
	}

	public void marcarConsulta(int dia, int mes, int ano, int hora, int min, Cliente cliente) {
		Data dataEncontrada = null;
		for (Data d : datas) {
			if (d.getDia() == dia && d.getMes() == mes && d.getAno() == ano) {
				dataEncontrada = d;
				break;
			}
		}

		if (dataEncontrada == null) {
			System.out.println("Erro: data não encontrada na agenda.");
			return;
		}

		Horario horarioEncontrado = null;
		for (Horario h : dataEncontrada.getHorarios()) {
			if (h.getHora() == hora && h.getMin() == min) {
				horarioEncontrado = h;
				break;
			}
		}

		if (horarioEncontrado == null) {
			System.out.println("Erro: horário não encontrado na data.");
			return;
		}

		if (horarioEncontrado.getCliente() == null) {
			horarioEncontrado.marcarConsulta(cliente);
			System.out.println("Consulta marcada com sucesso.");
		} else {
			System.out.println("Erro: horário já está ocupado.");
		}
	}

	public String toString() {
		if (datas.isEmpty()) {
			return "Agenda vazia.";
		}
		StringBuilder sb = new StringBuilder();
		for (Data d : datas) {
			sb.append(d.toString() + "\n");
		}
		return sb.toString();
	}
}
