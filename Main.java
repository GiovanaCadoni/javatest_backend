import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantas pessoas deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite o sexo (F/M):");
            String sexo = scanner.nextLine();

            pessoas.add(new Pessoa(nome, sexo));
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("\nLista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}