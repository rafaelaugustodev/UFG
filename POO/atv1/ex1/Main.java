public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Rafael", 19, "Masculino", "62 98519-1711");
        Pessoa p2 = new Pessoa("Pedro", 21, "Masculino", "62 98002-8922");
        Pessoa p3 = new Pessoa("Paula", 45, "Feminino", "62 99892-0921");

        System.out.println("----DADOS INICIAIS----");
        System.out.println(p1.mostrarDados());
        System.out.println(p2.mostrarDados());
        System.out.println(p3.mostrarDados());

        p1.setIdade(20);
        p1.setTelefone("62 00000-0000");

        System.out.println("----TESTE DE ENCAPSULAMENTO----");
        System.out.println("O " + p1.getNome() + " fez aniversário! Agora tem " + p1.getIdade() + " anos.");
        System.out.println("O novo telefone de contato é: " + p1.getTelefone());
    }
}