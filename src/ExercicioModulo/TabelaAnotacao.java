package ExercicioModulo;

import java.lang.annotation.Annotation;

@Tabela(nome = "Tabela de Anotação",linhasEColunas = 10,departamento = "RH")
public class TabelaAnotacao {
    public static void main(String[] args) {

        Class<?> classe = TabelaAnotacao.class;
        Annotation anotacao = classe.getAnnotation(Tabela.class);
        if (anotacao instanceof Tabela) {
            Tabela tabela = (Tabela) anotacao;
            System.out.println("Nome: " + tabela.nome());
            System.out.println("Departamento: " + tabela.departamento());
            System.out.println("Linhas e Colunas: " + tabela.linhasEColunas());

        }

    }
}

