import modelo.Sedan;
import modelo.SUV;
import servico.Garagem;

public class Main {
    public static void main(String[] args) {

        Garagem<Sedan> garagemSedan = new Garagem<>();
        Garagem<SUV> garagemSUV = new Garagem<>();

        Sedan sedan1 = new Sedan("Toyota", "Corolla");
        SUV suv1 = new SUV("Jeep", "Compass");

        garagemSedan.adicionarCarro(sedan1);
        garagemSUV.adicionarCarro(suv1);

        System.out.println("=== Sedans ===");
        garagemSedan.listarCarros();

        System.out.println("\n=== SUVs ===");
        garagemSUV.listarCarros();
    }
}