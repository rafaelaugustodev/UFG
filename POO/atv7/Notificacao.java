public class Notificacao extends Documento {
    public Notificacao(int numero, String remetente) {
        super(numero, remetente);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Notificação [Número: " + numero + ", Remetente: " + remetente + "]");
    }
}