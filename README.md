# 📘 Documentação do Sistema de Cadastro em Console

## 1. 🎯 Objetivo
O programa é um mini sistema interativo em console feito em Java, cujo objetivo é permitir ao usuário:

Cadastrar pessoas (nome e idade).

Listar todas as pessoas cadastradas.

Verificar quem é maior de idade.

Buscar uma pessoa pelo nome.

Remover uma pessoa do cadastro.

Sair do sistema.

Ele foi construído usando ArrayList para armazenar os dados em listas paralelas (nomes e idades).

## 2. ⚙️ Estrutura do Código
### Classes e Métodos
Classe Principal (Main)
Contém o método main, responsável por executar todo o sistema.

Variáveis principais:

ArrayList<String> nomes = new ArrayList<>();
ArrayList<Integer> idades = new ArrayList<>();
Scanner scanner = new Scanner(System.in);

nomes: guarda os nomes das pessoas cadastradas.

idades: guarda as idades correspondentes.

scanner: captura entradas do usuário no console.

Menu Principal (laço do...while)
Mantém o programa em execução até que o usuário escolha a opção 4 - Sair.

## 3. 📑 Funcionalidades
### 3.1. Cadastrar Pessoa

System.out.print("Digite o nome: ");
String nome = scanner.nextLine();

System.out.print("Digite a idade: ");
int idade = scanner.nextInt();

nomes.add(nome);
idades.add(idade);

O usuário informa um nome e idade.

Ambos são salvos em listas paralelas (nomes e idades).

A posição em cada lista corresponde a mesma pessoa.

### 3.2. Listar Pessoas

for (int i = 0; i < nomes.size(); i++) {
    System.out.println((i+1) + ". Nome: " + nomes.get(i) + " | Idade: " + idades.get(i));
}

Percorre as listas e exibe todos os nomes e idades cadastrados.

O índice da lista (i) garante que o nome e idade certos apareçam juntos.

### 3.3. Verificar Maiores de Idade

for (int i = 0; i < nomes.size(); i++) {
    if (idades.get(i) >= 18) {
        System.out.println(nomes.get(i) + " é maior de idade (" + idades.get(i) + " anos).");
    }
}

Percorre a lista de idades.

Exibe apenas quem tem 18 anos ou mais.

### 3.4. Buscar Pessoa pelo Nome

System.out.print("Digite o nome para buscar: ");
String busca = scanner.nextLine();

boolean encontrado = false;
for (int i = 0; i < nomes.size(); i++) {
    if (nomes.get(i).equalsIgnoreCase(busca)) {
        System.out.println("Encontrado: " + nomes.get(i) + " | Idade: " + idades.get(i));
        encontrado = true;
    }
}
if (!encontrado) {
    System.out.println("Pessoa não encontrada!");
}


O usuário digita um nome.

O sistema procura na lista de nomes.

Se encontrar, exibe os dados. Caso contrário, informa que não encontrou.

### 3.5. Remover Pessoa
O usuário digita o nome da pessoa.

Se for encontrado, é removido da lista de nomes e idades.

O break encerra a busca após a primeira ocorrência.

### 3.6. Sair do Sistema

System.out.println("Encerrando o sistema.");

Fecha o laço do...while quando o usuário escolhe a opção 6 (ou 4, no esboço inicial).

## 4. 📝 Fluxo de Execução
O sistema inicia exibindo o menu principal.

O usuário escolhe uma opção.

O sistema executa a funcionalidade escolhida.

Retorna ao menu até que o usuário escolha Sair.

## 5. 🚀 Possíveis Melhorias

Criar uma classe Pessoa para evitar listas paralelas.

Salvar os dados em arquivo de texto ou banco de dados.

Adicionar validações de entrada (não permitir idade negativa, por exemplo).

Melhorar a busca permitindo procurar por parte do nome.

Adicionar edição de cadastro.
