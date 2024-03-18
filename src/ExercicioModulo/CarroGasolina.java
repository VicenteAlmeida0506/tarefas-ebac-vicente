package ExercicioModulo;

public class CarroGasolina implements Carro {
    @Override
    public void acelerar() {
        System.out.println("Carro a gasolina acelerando!!");

    }

    @Override
    public void frear() {
        System.out.println("Carro a gasolina freando...");

    }
}
