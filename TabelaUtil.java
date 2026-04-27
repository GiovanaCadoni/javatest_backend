package util;

import anotacoes.Tabela;

public class TabelaUtil {

    public static String getNomeTabela(Class<?> clazz) {

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            return tabela.value();
        }

        throw new RuntimeException("Classe não possui a annotation @Tabela");
    }
}