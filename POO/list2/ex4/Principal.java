public class Principal {
    public static void main(String[] args) {
        Robo robo1 = new Robo(1, 100.0);
        Robo robo2 = new Robo(2, 50.0);

        System.out.println("=== Estado inicial ===");
        System.out.println(robo1);
        System.out.println(robo2);

        System.out.println("\n=== Tentando andar com robôs desligados ===");
        robo1.andar(5, 3);
        System.out.println(robo1);
        robo2.andar(2, 4);
        System.out.println(robo2);

        System.out.println("\n=== Ligando robôs ===");
        robo1.ligar();
        System.out.println(robo1);
        robo2.ligar();
        System.out.println(robo2);

        System.out.println("\n=== Andando ===");
        robo1.andar(10, 5);
        System.out.println(robo1);
        robo2.andar(3, 7);
        System.out.println(robo2);

        System.out.println("\n=== Parando ===");
        robo1.parar();
        System.out.println(robo1);
        robo2.parar();
        System.out.println(robo2);

        System.out.println("\n=== Aspirando ===");
        robo1.aspirar(30);
        System.out.println(robo1);
        robo2.aspirar(60);
        System.out.println(robo2);

        System.out.println("\n=== Desligando ===");
        robo1.desligar();
        System.out.println(robo1);
        robo2.desligar();
        System.out.println(robo2);
    }
}
