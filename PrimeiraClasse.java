public class PrimeiraClasse {
    public static void main(String args[]) {
       System.out.println("Ola Giovana");
       Cliente cliente = new Cliente();
       cliente.cadastraEndereco("Rua teste");
       cliente.setCodigo(1);

        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
    }
}
/**
 *
 */
