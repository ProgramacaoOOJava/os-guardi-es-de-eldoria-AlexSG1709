// Subclasse Guerreiro herdando de Personagem
public class Guerreiro extends Personagem {

    // Construtor utilizando o super() para inicializar a superclasse
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    // Sobrescrita (@Override) do método abstrato com mensagem personalizada
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + this.nome + " ataca com Espada Flamejante!");
    }
}
