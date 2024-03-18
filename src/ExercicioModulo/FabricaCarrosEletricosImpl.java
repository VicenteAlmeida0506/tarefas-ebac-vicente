package ExercicioModulo;

public class FabricaCarrosEletricosImpl implements FabricaCarrosEletricos{
    @Override
    public Carro criarCarroEletrico() {
        return new CarroEletrico();
    }
}
