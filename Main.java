import model.Cliente;
import util.TabelaUtil;

public class Main {
    public static void main(String[] args) {

        String nomeTabela = TabelaUtil.getNomeTabela(Cliente.class);
        System.out.println("Nome da tabela: " + nomeTabela);
    }
}