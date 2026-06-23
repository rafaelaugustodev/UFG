import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Data implements Serializable {

	private int dia;
	private int mes;
	private int ano;
	private List<Horario> horarios;

	public Data(int dia, int mes, int ano, int hora, int min, int qtde) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.horarios = new ArrayList<Horario>();

		int horaAtual = hora;
		int minAtual = min;

		for (int i = 0; i < qtde; i++) {
			horarios.add(new Horario(horaAtual, minAtual));
			minAtual = minAtual + 30;
			if (minAtual >= 60) {
				minAtual = minAtual - 60;
				horaAtual = horaAtual + 1;
			}
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Agenda do dia " + dia + "/" + mes + "/" + ano + ":\n");
		for (Horario h : horarios) {
			sb.append(h.toString() + "\n");
		}
		return sb.toString();
	}
}
