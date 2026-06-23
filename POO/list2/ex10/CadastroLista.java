import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Morador> moradores = new ArrayList<>();
        String continuar;

        do {
            System.out.println("=== Novo Morador ===");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Celular: ");
            String celular = sc.nextLine();
            System.out.print("Data de nascimento: ");
            String nasc = sc.nextLine();
            System.out.print("Sexo: ");
            String sexo = sc.nextLine();
            System.out.print("Bloco: ");
            String bloco = sc.nextLine();
            System.out.print("Apartamento: ");
            String apto = sc.nextLine();
            System.out.print("Código de acesso: ");
            String cod = sc.nextLine();

            moradores.add(new Morador(nome, cpf, celular, nasc, sexo, bloco, apto, cod));

            System.out.print("\nDeseja cadastrar mais um morador? (s/n): ");
            continuar = sc.nextLine();
            System.out.println();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n=== Moradores cadastrados ===");
        for (Morador m : moradores) {
            System.out.println(m);
        }

        sc.close();
    }
}
