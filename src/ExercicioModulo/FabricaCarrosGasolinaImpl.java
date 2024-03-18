package ExercicioModulo;

public class FabricaCarrosGasolinaImpl implements FabricaCarrosGasolina{
    @Override
    public Carro criarCarroGasolina() {
        return new CarroGasolina();
    }
}
