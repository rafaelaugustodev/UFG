public class Robo {
    private int numero;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private double quantidadePo;
    private double limitePo;

    public Robo(int numero, double limitePo) {
        this.numero = numero;
        this.status = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
        this.limitePo = limitePo;
    }

    public void ligar() {
        this.status = "ligado";
    }

    public void desligar() {
        this.status = "desligado";
    }

    public void andar(int x, int y) {
        if (status.equals("desligado")) {
            System.out.println("Robô " + numero + " está desligado. Ligue-o primeiro.");
            return;
        }
        this.posicaoX += x;
        this.posicaoY += y;
        this.status = "andando";
    }

    public void parar() {
        if (status.equals("desligado")) {
            System.out.println("Robô " + numero + " está desligado. Ligue-o primeiro.");
            return;
        }
        this.status = "parado";
    }

    public void aspirar(double quantidade) {
        if (status.equals("desligado")) {
            System.out.println("Robô " + numero + " está desligado. Ligue-o primeiro.");
            return;
        }
        this.quantidadePo += quantidade;
        if (this.quantidadePo >= this.limitePo) {
            System.out.println("Robô " + numero + " atingiu o limite de pó (" + limitePo + "). Desligando automaticamente.");
            desligar();
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getStatus() {
        return status;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public double getQuantidadePo() {
        return quantidadePo;
    }

    public double getLimitePo() {
        return limitePo;
    }

    public String toString() {
        return "Robô " + numero + " - Status: " + status + " - Posição: (" + posicaoX + "," + posicaoY +
                ") - Pó: " + quantidadePo + "/" + limitePo;
    }
}
