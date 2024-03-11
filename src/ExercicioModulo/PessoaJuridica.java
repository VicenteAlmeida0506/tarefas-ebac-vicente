package ExercicioModulo;

public class PessoaJuridica extends Pessoa{

    String cnpj;

    String nomeDosProprietarios;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeDosProprietarios() {
        return nomeDosProprietarios;
    }

    public void setNomeDosProprietarios(String nomeDosProprietarios) {
        this.nomeDosProprietarios = nomeDosProprietarios;
    }
}
