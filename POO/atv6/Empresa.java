public final class Empresa {
    private static Empresa instancia;
    private String nome;
    private String cnpj;
    private String endereco;
    private String cep;

    private Empresa() {
        this.nome = "EBM INCORPORACOES S/A";
        this.cnpj = "03.025.881/0002-74";
        this.endereco = "Rua T 55, 930 SETOR BUENO GOIANIA – GO";
        this.cep = "74215-170";
    }

    public static Empresa getInstancia() {
        if (instancia == null) {
            instancia = new Empresa();
        }
        return instancia;
    }

    public String getNome() { return nome; }
    public String getCnpj() { return cnpj; }
    public String getEndereco() { return endereco; }
    public String getCep() { return cep; }

    @Override
    public String toString() {
        return "Empresa: " + nome + ", CNPJ: " + cnpj + ", Endereço: " + endereco + ", CEP: " + cep;
    }
}