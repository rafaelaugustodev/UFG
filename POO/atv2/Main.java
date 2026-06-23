
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto(1);
        Produto p2 = new Produto(2, "Jogo Master");
        Produto p3 = new Produto(3, "Jogo Quebra-Cabeça", 30);
        Produto p4 = new Produto(4, "Jogo Batalha Naval", 10, "jogo", 100.00f);

        System.out.println("=== Inserindo dados do produto p1 ===");
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o tipo: ");
        String tipo = sc.nextLine();

        System.out.print("Digite o valor: ");
        float valor = sc.nextFloat();

        p1.inserir(nome, quantidade, tipo, valor);
        p2.inserir("Jogo Master", 20, "jogo", 150.00f);
        p3.inserir("Jogo Quebra-Cabeça", 30, "jogo", 50.00f);

        System.out.println("\n=== TESTES PRODUTO P1 ===");
        System.out.println(p1);
        float totalVenda1 = p1.vender(2);
        if (totalVenda1 == -1) {
            System.out.println("Estoque insuficiente.");
        } else {
            System.out.println("Venda: " + totalVenda1);
        }
        p1.comprar(5, 120.00f);
        System.out.println("p1 é igual a p2? " + p1.igual(p2));

        System.out.println("\n=== TESTES PRODUTO P2 ===");
        System.out.println(p2);
        float totalVenda2 = p2.vender(5);
        if (totalVenda2 == -1) {
            System.out.println("Estoque insuficiente.");
        } else {
            System.out.println("Venda: " + totalVenda2);
        }
        p2.comprar(10);
        System.out.println("p2 é igual a p3? " + p2.igual(p3));

        System.out.println("\n=== TESTES PRODUTO P3 ===");
        System.out.println(p3);
        float totalVenda3 = p3.vender(10);
        if (totalVenda3 == -1) {
            System.out.println("Estoque insuficiente.");
        } else {
            System.out.println("Venda: " + totalVenda3);
        }
        p3.comprar(5, 60.00f);
        System.out.println("p3 é igual a p4? " + p3.igual(p4));

        System.out.println("\n=== TESTES PRODUTO P4 ===");
        System.out.println(p4);
        float totalVenda4 = p4.vender(1);
        if (totalVenda4 == -1) {
            System.out.println("Estoque insuficiente.");
        } else {
            System.out.println("Venda: " + totalVenda4);
        }
        p4.comprar(2);
        System.out.println("p4 é igual a p1? " + p4.igual(p1));

        sc.close();
    }
}
