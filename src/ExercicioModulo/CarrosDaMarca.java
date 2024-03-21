package ExercicioModulo;

public class CarrosDaMarca{
    public static void main(String[] args) {
        Renault<String,Integer,Double,String> duster = new Renault("Duster",2021,1.6,"SUV");
        Renault<String,String,Double,String> oroch = new Renault<>("Oroch","0 KM",2.0,"Picape");
        Renault<String,Integer,String,String> kwid = new Renault<>("Kwid",2022,"1.Fraco","Popular");

        duster.imprimirCaracterisitcas();
        duster.separador();
        oroch.imprimirCaracterisitcas();
        oroch.separador();
        kwid.imprimirCaracterisitcas();
        kwid.separador();
        kwid.mensagemFinal();


        }
}
