import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void deveRetornarApenasMulheres() {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", "F"),
                new Pessoa("João", "M"),
                new Pessoa("Maria", "F"),
                new Pessoa("Carlos", "M")
        );

        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        // Verifica se todos são mulheres
        boolean todasSaoMulheres = mulheres.stream()
                .allMatch(p -> p.getSexo().equalsIgnoreCase("F"));

        assertTrue(todasSaoMulheres, "A lista contém pessoas que não são mulheres");
    }
}