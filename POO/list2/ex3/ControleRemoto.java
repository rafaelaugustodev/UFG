public class ControleRemoto {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        System.out.println("TV criada:");
        System.out.println(tv);

        tv.trocarCanal(5);
        System.out.println("Após trocar canal:");
        System.out.println(tv);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println("Após aumentar volume 3x:");
        System.out.println(tv);

        tv.diminuirVolume();
        System.out.println("Após diminuir volume:");
        System.out.println(tv);

        tv.trocarCanal(12);
        System.out.println("Após trocar canal novamente:");
        System.out.println(tv);
    }
}
