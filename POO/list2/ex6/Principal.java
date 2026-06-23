public class Principal {
    public static void main(String[] args) {
        Item[] itens = new Item[30];

        for (int i = 0; i < 10; i++) {
            itens[i] = new Filme("Filme " + (i + 1), 2000 + i, 90 + i, "Comentário filme " + (i + 1), "Diretor " + (i + 1));
        }
        for (int i = 0; i < 10; i++) {
            itens[10 + i] = new CD("CD " + (i + 1), 2010 + i, 45 + i, "Comentário cd " + (i + 1), "Artista " + (i + 1), 10 + i);
        }
        for (int i = 0; i < 10; i++) {
            itens[20 + i] = new Jogo("Jogo " + (i + 1), 2015 + i, 30 + i, "Comentário jogo " + (i + 1), i + 1, "Plataforma " + (i + 1));
        }

        for (Item item : itens) {
            System.out.println(item);
            if (item instanceof Jogo) {
                Jogo j = (Jogo) item;
                System.out.println(" -> Plataforma do jogo: " + j.getPlataforma());
            }
        }
    }
}
