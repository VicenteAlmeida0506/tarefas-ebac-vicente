package ExercicioModulo;

import java.util.Scanner;

/**
 * Criar uma classe chamada pessoa,depois duas subclasses,uma chamada de pessoa física e a outra pessoa jurídica.
 * A classe pessoa é a classe abstrata,inserir os atributos das pessoas física e juridica na classe abstrata e os atributos
 * nas classes concretas
 * */
public abstract class Pessoa {
    String nome;
    String endereco;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public boolean situacaoNoSerasa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esta pessoa está ativa no serasa?(SIM ou NÃO)");
        String situacao = scanner.nextLine();
        if (situacao.equalsIgnoreCase("Sim")){
            return true;

        }
        else {
            return false;
        }

    }
}
