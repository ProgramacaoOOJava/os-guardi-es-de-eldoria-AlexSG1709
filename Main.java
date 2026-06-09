public class Main {
    public static void main(String[] args) {
        
        // --- 1. CRIÇÃO DOS PERSONAGENS (Usando as subclasses/moldes corretos) ---
        // Primeiro Grupo (Aliança Luminosa)
        Guerreiro heroi1 = new Guerreiro("Arthus", 1, 100, 10.5);   // Poder: 1 * 10.5 = 10.5
        Mago heroi2 = new Mago("Elenara", 15, 80, 20.0);           // Poder: 15 * 20 = 300.0 (Exemplo do Print)

        // Segundo Grupo (Horda Sombria) - Guerreiro e Arqueiro juntos!
        Guerreiro heroi3 = new Guerreiro("Ragnar", 10, 120, 15.0); // Poder: 10 * 15 = 150.0
        Arqueiro heroi4 = new Arqueiro("Arthemis", 5, 80, 12.5);   // Poder: 5 * 12.5 = 62.5


        // --- 2. ENTRADA DE DADOS: GERENCIANDO OS GRUPOS (Associação Um-para-Muitos) ---
        Grupo aliancaLuminosa = new Grupo();
        aliancaLuminosa.adicionarPersonagem(heroi1);
        aliancaLuminosa.adicionarPersonagem(heroi2);

        Grupo hordaSombria = new Grupo();
        hordaSombria.adicionarPersonagem(heroi3);
        hordaSombria.adicionarPersonagem(heroi4);


        // --- 3. SAÍDA DE DADOS: LISTAGEM E COMBATES ÉPICOS ---
        System.out.println("=== MEMBROS DA HORDA SOMBRIA ===");
        // Demonstração do método listarPersonagens() usando a estrutura interna do Grupo
        hordaSombria.listarPersonagens();

        System.out.println("=== INÍCIO DAS BATALHAS DO NÍVEL MESTRE ===");
        
        // Duelo 1: Mago Elenara VS Guerreiro Ragnar
        // Aqui a Elenara vai atingir exatamente os 300 de poder exigidos no exemplo do seu exercício!
        aliancaLuminosa.batalhar(heroi2, heroi3); 

        // Duelo 2: Arqueiro Arthemis VS Guerreiro Arthus
        hordaSombria.batalhar(heroi4, heroi1);
    }
}
