// Subclasse Arqueiro herdando de Personagem
public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Arqueiro", nivel, pontosDeVida, poderBase);
    }

    // Sobrescrita do ataque especial do Arqueiro
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Arqueiro " + this.nome + " dispara uma Chuva de Flechas certeira!");
    }
}
