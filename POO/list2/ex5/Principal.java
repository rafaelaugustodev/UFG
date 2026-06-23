import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Digite o código do filme (0 para sair): ");
            codigo = sc.nextInt();
            sc.nextLine();

            if (codigo == 0) break;

            System.out.print("Digite o nome do filme: ");
            String nome = sc.nextLine();

            Filme filme = new Filme(codigo, nome);

            System.out.print("Digite o gênero: ");
            filme.setGenero(sc.nextLine());

            System.out.print("Digite o ano: ");
            filme.setAno(sc.nextInt());
            sc.nextLine();

            System.out.print("Digite o autor principal: ");
            filme.setAutorPrincipal(sc.nextLine());

            System.out.println(filme);
            System.out.println();
        }

        System.out.println("Total de filmes criados: " + Filme.getTotalFilmes());
        sc.close();
    }
}
