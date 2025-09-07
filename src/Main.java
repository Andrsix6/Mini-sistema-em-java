import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nome;
    int idade;

    Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    boolean temPermissao() {
        return idade >= 18 && idade <= 120;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.println("=== Cadastro de Usuários ===");

        String continuar;
        do {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = 0;

            // Validação de idade
            while (true) {
                if (scanner.hasNextInt()) {
                    idade = scanner.nextInt();
                    scanner.nextLine(); // limpar quebra de linha
                    break;
                } else {
                    System.out.print("Idade inválida. Digite novamente: ");
                    scanner.next(); // descarta lixo
                }
            }

            // Cria e armazena o usuário
            Usuario user = new Usuario(nome, idade);
            usuarios.add(user);

            // Pergunta se deseja continuar
            System.out.print("Deseja cadastrar outro usuário? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n=== Lista de Usuários Cadastrados ===");
        for (Usuario u : usuarios) {
            System.out.println("- " + u.nome + " (" + u.idade + " anos) " +
                    (u.temPermissao() ? "-> Permissão concedida" : "-> Sem permissão"));
        }

        scanner.close();
    }
}
