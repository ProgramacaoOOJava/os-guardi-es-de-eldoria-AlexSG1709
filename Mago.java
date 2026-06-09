// Subclasse Mago herdando de Personagem
public class Mago extends Personagem {

    // Construtor utilizando o super()
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    // Sobrescrita (@Override) com a magia do Mago
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + this.nome + " conjura uma Tempestade de Gelo!");
    }
}
