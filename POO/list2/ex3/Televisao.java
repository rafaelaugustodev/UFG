public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 0;
        this.canal = 0;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public String toString() {
        return "TV - Canal: " + canal + " - Volume: " + volume;
    }
}
