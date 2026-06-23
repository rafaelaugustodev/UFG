import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RelatorioImpostoRenda {

    public static void main(String[] args) {

        String arquivo = "funcionarios.txt";

        double totalFeminino = 0;
        double totalMasculino = 0;
        double totalGeral = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String linha;
            while ((linha = br.readLine()) != null) {

                if (linha.trim().isEmpty())
                    continue;

                String[] campos = linha.split("#");

                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario f = new Funcionario(nome, sexo, salario, dependentes);

                System.out.println(f.mostraFuncionario());

                double imposto = f.impostoRenda();
                totalGeral += imposto;
                if (sexo == 'F')
                    totalFeminino += imposto;
                else
                    totalMasculino += imposto;
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println();
        System.out.printf("Total de IR pago por funcionarios do sexo feminino:  R$ %.2f%n", totalFeminino);
        System.out.printf("Total de IR pago por funcionarios do sexo masculino: R$ %.2f%n", totalMasculino);
        System.out.printf("Total de IR pago por todos os funcionarios:          R$ %.2f%n", totalGeral);
    }
}
