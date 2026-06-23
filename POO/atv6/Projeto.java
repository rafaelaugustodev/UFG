public class Projeto {
    private String nomeProjeto;
    private String descricao;
    private Empresa empresa;

    public Projeto(String nomeProjeto, String descricao) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.empresa = Empresa.getInstancia();
    }

    public String getNomeProjeto() { return nomeProjeto; }
    public String getDescricao() { return descricao; }
    public Empresa getEmpresa() { return empresa; }

    @Override
    public String toString() {
        return "Projeto: " + nomeProjeto + ", Descrição: " + descricao + ", Empresa: " + empresa.getNome();
    }
}