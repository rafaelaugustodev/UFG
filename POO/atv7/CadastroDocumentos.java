public class CadastroDocumentos {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaDocumentos();

        Documento doc1 = fabrica.criarDocumento(1, "João", "Carta");
        Documento doc2 = fabrica.criarDocumento(2, "Maria", "Telegrama");
        Documento doc3 = fabrica.criarDocumento(3, "Empresa X", "Notificacao");

        doc1.exibirInfo();
        doc2.exibirInfo();
        doc3.exibirInfo();
    }
}