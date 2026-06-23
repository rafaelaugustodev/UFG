public class Carta extends Documento {
    public Carta(int numero, String remetente) {
        super(numero, remetente);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carta [Número: " + numero + ", Remetente: " + remetente + "]");
    }
}