public abstract class Personagem {
    //Atributos
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    //Construocao
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }
    // Métodos Getters necessários para a lógica de combate 
    public String getNome() {
        return this.nome;
    }

    public int getNivel() {
        return this.nivel;
    }

    public double getPoderBase() {
        return this.poderBase;
    }

    //Abstrato
    public abstract void usarHabilidadeEspecial();

    //Informacao dos status
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
        System.out.println("Poder Base: " + this.poderBase);

    }
}

