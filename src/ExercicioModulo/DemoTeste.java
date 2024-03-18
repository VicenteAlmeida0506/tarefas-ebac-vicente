package ExercicioModulo;

public class DemoTeste {
    public static void main(String[] args) {
        FabricaCarrosEletricos fabricaCarrosEletricos = new FabricaCarrosEletricosImpl();
        Carro carroEletrico = fabricaCarrosEletricos.criarCarroEletrico();
        carroEletrico.acelerar();
        carroEletrico.frear();

        FabricaCarrosGasolina fabricaCarrosGasolina = new FabricaCarrosGasolinaImpl();
        Carro carroGasolina = fabricaCarrosGasolina.criarCarroGasolina();
        carroGasolina.acelerar();
        carroGasolina.frear();
    }
}


