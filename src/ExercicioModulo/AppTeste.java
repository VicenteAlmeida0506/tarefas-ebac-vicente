package ExercicioModulo;

import java.util.Scanner;

public class AppTeste {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa!");
        String nome = sc.nextLine();
        System.out.println("Digite o cpf da pessoa!");
        String cpf = sc.nextLine();
        System.out.println("Digite o nome do pai!");
        String nomeDoPai = sc.nextLine();
        System.out.println("Digite o nome da mãe!");
        String nomeDaMae = sc.nextLine();
        System.out.println("Digite o endereço!");
        String endereco = sc.nextLine();

        pessoaFisica.setNome(nome);
        pessoaFisica.setCpf(cpf);
        pessoaFisica.setNomeDoPai(nomeDoPai);
        pessoaFisica.setNomeDaMae(nomeDaMae);
        pessoaFisica.setEndereco(endereco);


        System.out.println("A pessoa física tem o nome de "+pessoaFisica.getNome()+".");
        System.out.println("Seu cpf é " + pessoaFisica.getCpf()+".");
        System.out.println("Os seus pais se chamam "+ pessoaFisica.getNomeDoPai()+" e "+ pessoaFisica.getNomeDaMae()+",e o seu endereço é "+ pessoaFisica.getEndereco()+".");
        System.out.println("Sua situação no serasa:" + pessoaFisica.situacaoNoSerasa());

        System.out.println("Agora vamos as informações da pessoa jurídica!!");
        Scanner scpj = new Scanner(System.in);
        System.out.println("Digite o nome da empresa!");
        String nomepj = scpj.nextLine();
        System.out.println("Digite o cnpj da empresa!");
        String cnpj = scpj.nextLine();
        System.out.println("Digite o nome dos proprietários!");
        String nomeDosProp = scpj.nextLine();
        System.out.println("Digite o endereço!");
        String enderecopj = scpj.nextLine();

        pessoaJuridica.setNome(nomepj);
        pessoaJuridica.setCnpj(cnpj);
        pessoaJuridica.setNomeDosProprietarios(nomeDosProp);
        pessoaJuridica.setEndereco(enderecopj);


        System.out.println("A pessoa jurídica tem o nome de "+pessoaJuridica.getNome()+".");
        System.out.println("Seu cnpj é " + pessoaJuridica.getCnpj()+".");
        System.out.println("Os seus proprietários se chamam "+ pessoaJuridica.getNomeDosProprietarios()+",e o seu endereço é "+ pessoaJuridica.getEndereco()+".");
        System.out.println("Sua situação no serasa:" + pessoaJuridica.situacaoNoSerasa());

    }
}
