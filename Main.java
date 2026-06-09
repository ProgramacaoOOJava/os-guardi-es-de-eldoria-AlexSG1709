public class Main {
    public static void main(String[] args) {
        // Entrada de Dados
        Personagem[] exercitoEldoria = new Personagem[2];

        // Guardando subclasses diferentes na mesma estrutura genérica de Personagem
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Arthemis", "Mago", 5, 80, 12.5);

        // Exibindo o status inicial de ambos usando o laço obrigatório do requisito
        System.out.println("=== PREPARAÇÃO PARA A BATALHA ===");
        for (Personagem heroi : exercitoEldoria) {
            heroi.exibirStatus();
            System.out.println();
        }

        System.out.println("=== INÍCIO DO CONFRONTO ===");
        
        // 2. Criando ações diretas entre os dois personagens!
        // Buscamos o herói 0 (Guerreiro) e o herói 1 (Mago) para agirem no mesmo bloco
        
        // O Guerreiro toma a iniciativa e ataca
        exercitoEldoria[0].usarHabilidadeEspecial();
        System.out.println("O impacto do golpe faz o chão tremer ao redor de " + exercitoEldoria[1].nome + "!");
        
        System.out.println(); // Pula linha

        // O Mago reage imediatamente respondendo ao ataque
        System.out.println(exercitoEldoria[1].nome + " recua rapidamente e prepara seu contra-ataque:");
        exercitoEldoria[1].usarHabilidadeEspecial();
        
        System.out.println(); // Pula linha
        System.out.println("=== FIM DO TURNO ===");

    }
}
