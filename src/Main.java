import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // listas paralelas para os dados do usuário
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao;

        // mostra as opções para o usuário
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Verificar maiores de idade");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            // Executa a ação de acordo com a escolha do usuário
            switch (opcao) {
                case 1:
                    // aqui vamos pedir nome e idade, e adicionar nas listas
                    scanner.nextLine(); // limpa o buffer

                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    // salva os cadastros nome e idade em suas listas
                    Pessoa p = new Pessoa(nome, idade);
                    pessoas.add(p);

                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;
                case 2:
                    // listarPessoas();
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada ainda.");
                    } else {
                        System.out.println("\n--- Lista de Pessoas ---");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println((i + 1) + ". " + pessoas.get(i));
                        }
                    }
                    break;
                case 3:
                    // verificarMaioresIdade();
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada ainda");
                    } else {
                        System.out.println("\n--- Maiores de Idade ---");
                        boolean encontrou = false;
                        for (Pessoa pessoa : pessoas) {
                            if (pessoa.isMaiorDeIdade()) {
                                System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
                                encontrou = true;
                            }
                        }
                        if (!encontrou) {
                            System.out.println("Nenhuma pessoa maior de idade encontrada.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            // Encerra a execução do console
        } while (opcao != 4);
        scanner.close();
    }
}