import java.util.Scanner;

public class LeituraNumero {

    public static void main(String[] args) {

        // scanner para ler do console
        Scanner scanner = new Scanner(System.in);

        // variável primitiva
        int numeroPrimitivo;

        // lendo valor
        System.out.print("Digite um número inteiro: ");
        numeroPrimitivo = scanner.nextInt();

        // convertendo para wrapper
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // resultados
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor Wrapper: " + numeroWrapper);

        // Fechando o scanner
        scanner.close();
    }
}