import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioModuloColecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                masculino.add(nome);
            } else if (sexo == 'F') {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Tente novamente.");
            }
        }

        System.out.println("Pessoas do sexo masculino: " + masculino);
        System.out.println("Pessoas do sexo feminino: " + feminino);

        scanner.close();
    }
}
