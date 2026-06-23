public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "62999990001");
        Cliente cliente2 = new Cliente("Maria Souza", "62999990002");

        Conta conta1 = new ContaCorrente(1, cliente1);
        Conta conta2 = new ContaPoupanca(2, cliente2);

        conta1.depositar(1000);
        conta1.sacar(200);
        System.out.println(conta1);

        conta2.depositar(1000);
        conta2.sacar(200);
        System.out.println(conta2);

        ((ContaPoupanca) conta2).atualizaSaldo(10);
        System.out.println(conta2);

        ContaCorrente cc = new ContaCorrente(3, cliente1);
        ContaPoupanca cp = new ContaPoupanca(4, cliente2);
        cc.depositar(1000);
        cc.sacar(200);
        cp.depositar(1000);
        cp.sacar(200);
        cp.atualizaSaldo(10);
        System.out.println(cc);
        System.out.println(cp);

        ContaCorrente cc2 = new ContaCorrente(5, cliente1);
        ContaPoupanca cp2 = new ContaPoupanca(6, cliente2);
        cc2.depositar(500);
        cc.transferir(100, cc2);
        System.out.println(cc);
        System.out.println(cc2);

        cp2.depositar(500);
        cp.transferir(100, cp2);
        System.out.println(cp);
        System.out.println(cp2);

        ContaSalario cs = new ContaSalario(7, cliente1);
        ContaSalario cs2 = new ContaSalario(8, cliente2);
        cs.depositar(1000);
        cs.sacar(200);
        System.out.println(cs);

        cs2.depositar(800);
        cs.transferir(150, cs2);
        System.out.println(cs);
        System.out.println(cs2);

        cc.transferir(50, cp);
        System.out.println(cc);
        System.out.println(cp);

        cs.transferir(50, cp);
        System.out.println(cs);
        System.out.println(cp);

        cp.transferir(30, cs);
        System.out.println(cp);
        System.out.println(cs);
    }
}
