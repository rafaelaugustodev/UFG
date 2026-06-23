public class Telegrama extends Documento {
    public Telegrama(int numero, String remetente) {
        super(numero, remetente);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Telegrama [Número: " + numero + ", Remetente: " + remetente + "]");
    }
}