public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;

    public Empresa(String razaoSocial, String cnpj, Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return razaoSocial + " | CNPJ: " + cnpj + " | Endereço: " + endereco;
    }
}
