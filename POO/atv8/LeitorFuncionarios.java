import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeitorFuncionarios {

    public static void main(String[] args) {

        String arquivoObjetos = "funcionarios.dat";

        double totalFeminino = 0;
        double totalMasculino = 0;
        double totalGeral = 0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivoObjetos))) {

            while (true) {
                try {
                    Funcionario f = (Funcionario) ois.readObject();

                    System.out.println(f.mostraFuncionario());

                    double imposto = f.impostoRenda();
                    totalGeral += imposto;
                    if (f.sexo == 'F')
                        totalFeminino += imposto;
                    else
                        totalMasculino += imposto;

                } catch (EOFException eof) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler os objetos: " + e.getMessage());
        }

        System.out.println();
        System.out.printf("Total de IR pago por funcionarios do sexo feminino:  R$ %.2f%n", totalFeminino);
        System.out.printf("Total de IR pago por funcionarios do sexo masculino: R$ %.2f%n", totalMasculino);
        System.out.printf("Total de IR pago por todos os funcionarios:          R$ %.2f%n", totalGeral);
    }
}
