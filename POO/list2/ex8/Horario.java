public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora) {
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void setHorario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHorario() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public static boolean validarHora(int hora) {
        return hora >= 0 && hora < 24;
    }

    public static boolean validarMinuto(int minuto) {
        return minuto >= 0 && minuto < 60;
    }

    public static boolean validarSegundo(int segundo) {
        return segundo >= 0 && segundo < 60;
    }

    public static int diferencaEmMinutos(Horario h1, Horario h2) {
        int total1 = h1.hora * 60 + h1.minuto + h1.segundo / 60;
        int total2 = h2.hora * 60 + h2.minuto + h2.segundo / 60;
        return Math.abs(total1 - total2);
    }

    public String toString() {
        return getHorario();
    }
}
