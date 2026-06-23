public class Principal {
    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstancia();
        System.out.println(empresa);

        Projeto projeto1 = new Projeto("Sistema de Gestão", "Desenvolvimento do sistema ERP interno");
        Projeto projeto2 = new Projeto("Aplicativo Mobile", "Aplicativo para clientes");

        System.out.println(projeto1);
        System.out.println(projeto2);

        System.out.println("Todas as referências apontam para a mesma instância? " 
            + (projeto1.getEmpresa() == projeto2.getEmpresa()));
    }
}