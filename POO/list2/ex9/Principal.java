import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();

        while (true) {
            System.out.print("Código do livro (0 para sair): ");
            int codigo = sc.nextInt();
            sc.nextLine();
            if (codigo == 0) break;

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            Livro livro = new Livro(codigo, titulo);

            System.out.print("Nome do autor: ");
            String nome = sc.nextLine();
            System.out.print("Sobrenome do autor: ");
            String sobrenome = sc.nextLine();
            System.out.print("Nome intermediário do autor: ");
            String interm = sc.nextLine();
            livro.setAutor(new Pessoa(nome, sobrenome, interm));

            System.out.print("Editora: ");
            livro.setEditora(sc.nextLine());

            System.out.print("Edição: ");
            livro.setEdicao(sc.nextInt());
            sc.nextLine();

            System.out.print("Ano: ");
            livro.setAno(sc.nextInt());
            sc.nextLine();

            System.out.print("Local: ");
            livro.setLocal(sc.nextLine());

            System.out.print("Gênero: ");
            livro.setGenero(sc.nextLine());

            livros.add(livro);
        }

        System.out.println("\n=== Livros cadastrados ===");
        Map<String, Integer> porGenero = new HashMap<>();
        for (Livro l : livros) {
            System.out.println(l);
            System.out.println();
            porGenero.merge(l.getGenero(), 1, Integer::sum);
        }

        System.out.println("Total de livros: " + Livro.getTotalLivros());
        System.out.println("Totais por gênero:");
        for (Map.Entry<String, Integer> e : porGenero.entrySet()) {
            System.out.println("  " + e.getKey() + ": " + e.getValue());
        }

        sc.close();
    }
}
