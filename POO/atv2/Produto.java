public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private float valor;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }

    public float vender(int qtd) {
        if (qtd <= 0 || quantidade < qtd) {
            return -1;
        }

        quantidade -= qtd;
        return qtd * valor;
    }

    public void comprar(int qtd, float novoValor) {
        if (qtd <= 0) {
            System.out.println("Quantidade inválida para compra.");
            return;
        }

        this.quantidade += qtd;
        this.valor = novoValor;
        System.out.println("Compra realizada com alteração de valor.");
    }

    public void comprar(int qtd) {
        if (qtd <= 0) {
            System.out.println("Quantidade inválida para compra.");
            return;
        }

        this.quantidade += qtd;
        System.out.println("Compra realizada sem alteração de valor.");
    }

    public void inserir(String nome, int qtd, String tipo, float valor) {
        this.nome = nome;
        this.quantidade = qtd;
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean igual(Produto p) {
        return this.nome.equals(p.getNome()) && this.tipo.equals(p.getTipo());
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + "\nNome: " + nome
                + "\nQuantidade: " + quantidade
                + "\nTipo: " + tipo
                + "\nValor: " + valor
                + "\n";
    }
}