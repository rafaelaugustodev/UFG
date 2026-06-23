import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Primeiro Horário ===");
        Horario h1 = lerHorario(sc);

        System.out.println("=== Segundo Horário ===");
        Horario h2 = lerHorario(sc);

        System.out.println("\nHorário 1: " + h1);
        System.out.println("Horário 2: " + h2);
        System.out.println("Diferença em minutos: " + Horario.diferencaEmMinutos(h1, h2));

        sc.close();
    }

    private static Horario lerHorario(Scanner sc) {
        int hora, minuto, segundo;
        do {
            System.out.print("Hora (0-23): ");
            hora = sc.nextInt();
        } while (!Horario.validarHora(hora));
        do {
            System.out.print("Minuto (0-59): ");
            minuto = sc.nextInt();
        } while (!Horario.validarMinuto(minuto));
        do {
            System.out.print("Segundo (0-59): ");
            segundo = sc.nextInt();
        } while (!Horario.validarSegundo(segundo));

        return new Horario(hora, minuto, segundo);
    }
}
