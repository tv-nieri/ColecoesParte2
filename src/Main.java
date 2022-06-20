import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Collection<Pessoa> masculino = new ArrayList<>();
        Collection<Pessoa> feminino = new ArrayList<>();

        System.out.println("Cadastrar pessoa? <s/n>");
        input = scanner.nextLine();

        while (input.equals("s")) {

            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o sexo: <M/F>");
            String sexo = scanner.nextLine();
            sexo = sexo.toUpperCase();

            if (sexo.equals("M")) {
                Homem h = new Homem(nome);
                masculino.add(h);
            } else if (sexo.equals("F")) {
                Mulher m = new Mulher(nome);
                feminino.add(m);
            }
            System.out.println("-----------------------------------------------------");
            System.out.println("Cadastrar pessoa? <s/n>");
            input = scanner.nextLine();
        }

        for (Pessoa p: masculino) {
            System.out.println(p.toString());
        }

        for (Pessoa p : feminino) {
            System.out.println(p.toString());
        }
    }
}
