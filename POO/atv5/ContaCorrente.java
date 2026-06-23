public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor - 0.05;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor - 0.05;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}
