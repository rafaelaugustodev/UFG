import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GravadorFuncionarios {

    public static void main(String[] args) {

        String arquivoTexto = "funcionarios.txt";
        String arquivoObjetos = "funcionarios.dat";

        int gravados = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoTexto));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoObjetos))) {

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

                oos.writeObject(f);
                gravados++;
            }

        } catch (IOException e) {
            System.out.println("Erro ao gravar os objetos: " + e.getMessage());
        }

        System.out.println(gravados + " funcionarios gravados em funcionarios.dat");
    }
}
