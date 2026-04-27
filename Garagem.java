package servico;

import java.util.ArrayList;
import java.util.List;
import modelo.Carro;

public class Garagem<T extends Carro> {

    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        for (T carro : carros) {
            carro.exibirInfo();
        }
    }
}
