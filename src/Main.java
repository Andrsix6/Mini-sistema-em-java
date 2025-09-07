import java.util.Scanner;

public class Main {

    // Método para verificar se uma nota é maior ou igual a 70
    static boolean check(int grade) {
        return grade >= 70;
    }

    // Método para calcular a porcentagem
    static double perc(double num, int percentage) {
        return num * percentage / 100;
    }

    // Método para mostrar um loop simples
    static void loops(String text, int number) {
        System.out.println(text + number);
        for (int i = 1; i <= number; i++) {
            System.out.println("Loop #" + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login do usuário
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int age = 0;

        // Validação da idade
        while (true) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer
                break;
            } else {
                System.out.print("Idade inválida! Digite novamente: ");
                scanner.next(); // descarta entrada inválida
            }
        }

        // Verificação de permissão
        if (age >= 18 && age <= 120) {
            System.out.println("Você tem permissão!");

            // Saudação com switch
            switch (name) {
                case "André":
                    System.out.println("Bem-vindo ADM André!");
                    break;
                default:
                    System.out.println("Bem-vindo, " + name + "!");
            }

            // Menu interativo
            String opcao = "";
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Calcular porcentagem (Resultado)");
                System.out.println("2. Verificar nota (check)");
                System.out.println("3. Executar loop (loop)");
                System.out.println("4. Sair (sair)");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextLine();

                switch (opcao.toLowerCase()) {
                    case "resultado":
                    case "1":
                        System.out.print("Digite um número: ");
                        double num = scanner.nextDouble();

                        System.out.print("Digite a porcentagem: ");
                        int porcentagem = scanner.nextInt();
                        scanner.nextLine(); // limpa o buffer

                        double resultado = perc(num, porcentagem);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case "check":
                    case "2":
                        System.out.print("Digite uma nota para verificar (0 a 100): ");
                        int nota = scanner.nextInt();
                        scanner.nextLine(); // limpa o buffer

                        if (check(nota)) {
                            System.out.println("Nota suficiente (>= 70).");
                        } else {
                            System.out.println("Nota insuficiente (< 70).");
                        }
                        break;

                    case "loop":
                    case "3":
                        System.out.print("Digite um número de repetições: ");
                        int repeticoes = scanner.nextInt();
                        scanner.nextLine(); // limpa o buffer

                        loops("Executando loop até: ", repeticoes);
                        break;

                    case "sair":
                    case "4":
                        System.out.println("Saindo do sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            } while (!opcao.equalsIgnoreCase("sair") && !opcao.equals("4"));

        } else {
            System.out.println("Você não tem permissão!");
        }

        scanner.close();
    }
}
