public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Metodo utilitário
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Nome : " + nome + ", idade: " + idade;
    }
}
