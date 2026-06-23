public abstract class Documento {
    protected int numero;
    protected String remetente;

    public Documento(int numero, String remetente) {
        this.numero = numero;
        this.remetente = remetente;
    }

    public abstract void exibirInfo();
}