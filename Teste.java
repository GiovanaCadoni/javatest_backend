import model.Cliente;
import anotacoes.Tabela;

public class Teste {
    public static void main(String[] args) {

        Class<Cliente> clazz = Cliente.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());
        }
    }
}