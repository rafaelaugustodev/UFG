import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Conta[] contas = new Conta[100];
        int total = 0;

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta (0 para sair):"));
            if (numero == 0) {
                break;
            }

            String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de conta:\n1 - Corrente\n2 - Salário\n3 - Poupança"));

            Cliente cliente = new Cliente(nome, telefone);
            Conta conta = null;

            if (tipo == 1) {
                conta = new ContaCorrente(numero, cliente);
            } else if (tipo == 2) {
                conta = new ContaSalario(numero, cliente);
            } else if (tipo == 3) {
                conta = new ContaPoupanca(numero, cliente);
            }

            contas[total] = conta;
            total++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < total; i++) {
            sb.append(contas[i].toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
