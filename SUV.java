package modelo;

public class SUV extends Carro {

    public SUV(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("SUV: " + getMarca() + " " + getModelo());
    }
}