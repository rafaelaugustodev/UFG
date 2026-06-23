public class CadastroMultiplo {
    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[5];

        cliente[0] = new Cliente("Maria");
        cliente[0].setIdade(20);
        cliente[0].setTelefone("999-8899");

        cliente[1] = new Cliente("João");
        cliente[1].setIdade(25);
        cliente[1].setTelefone("988-7766");

        cliente[2] = new Cliente("Pedro");
        cliente[2].setIdade(30);
        cliente[2].setTelefone("977-6655");

        cliente[3] = new Cliente("Ana");
        cliente[3].setIdade(28);
        cliente[3].setTelefone("966-5544");

        cliente[4] = new Cliente("Carlos");
        cliente[4].setIdade(35);
        cliente[4].setTelefone("955-4433");

        for (int i = 0; i < cliente.length; i++) {
            System.out.println(cliente[i]);
        }
    }
}
