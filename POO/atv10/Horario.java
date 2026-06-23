import java.io.Serializable;

public class Horario implements Serializable {

	private int hora;
	private int min;
	private Cliente cliente;

	public Horario(int hora, int min) {
		this.hora = hora;
		this.min = min;
		this.cliente = null;
	}

	public void marcarConsulta(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String toString() {
		String situacao;
		if (cliente == null) {
			situacao = "Disponível";
		} else {
			situacao = cliente.toString();
		}
		return String.format("%02d:%02d - %s", hora, min, situacao);
	}
}
