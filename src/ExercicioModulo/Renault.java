package ExercicioModulo;

public class Renault<M,A,P,C>{

    private M modelo;

    private A anoFabricacao;
    private P potenciaMotor;

    private C categoria;


    public Renault(M modelo, A anoFabricacao , P potenciaMotor,C categoria){
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.potenciaMotor = potenciaMotor;
        this.categoria = categoria;
    }


    public void imprimirCaracterisitcas(){
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano de fabricação: " + anoFabricacao);
    System.out.println("Potência do Motor: " + potenciaMotor);
        System.out.println("Categoria: " + categoria);
}
public void separador(){
    System.out.println("_______________________________");
}
public void mensagemFinal(){
    System.out.println("E ai? Sem saber o preço, qual te agrada mais?");
}

}
