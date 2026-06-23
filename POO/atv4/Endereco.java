public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String complemento, String cep,
                    String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return rua + ", " + numero +
                (complemento != null && !complemento.isEmpty() ? " (" + complemento + ")" : "") +
                " - " + bairro +
                " - " + cidade + "/" + estado +
                " - CEP: " + cep;
    }
}
