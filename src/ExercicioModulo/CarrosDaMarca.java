
package ExercicioModulo;

import java.util.ArrayList;
import java.util.List;

public class CarrosDaMarca {
    public static void main(String[] args) {
        List<Renault<?, ?, ?, ?>> listaCarros = new ArrayList<>();

        Renault<String, Integer, Double, String> duster = new Renault<>("Duster", 2021, 1.6, "SUV");
        Renault<String, String, Double, String> oroch = new Renault<>("Oroch", "0 KM", 2.0, "Picape");
        Renault<String, Integer, String, String> kwid = new Renault<>("Kwid", 2022, "1.Fraco", "Popular");

        listaCarros.add(duster);
        listaCarros.add(oroch);
        listaCarros.add(kwid);

        for (Renault<?, ?, ?, ?> carro : listaCarros) {
            carro.imprimirCaracterisitcas();
            carro.separador();
        }
        kwid.mensagemFinal();
    }
}
