public class FabricaDocumentos extends Fabrica {
    @Override
    public Documento criarDocumento(int numero, String remetente, String tipo) {
        switch (tipo.toLowerCase()) {
            case "carta":
                return new Carta(numero, remetente);
            case "telegrama":
                return new Telegrama(numero, remetente);
            case "notificacao":
                return new Notificacao(numero, remetente);
            default:
                throw new IllegalArgumentException("Tipo de documento inválido: " + tipo);
        }
    }
}