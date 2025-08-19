package aula_1;

class Zumbi {
    // Atributos
    double vida;
    String nome;

    // Construtor
    Zumbi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Método para mostrar a vida
    double mostraVida() {
        return vida;
    }

    // Método para transferir vida para outro zumbi
    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (this.vida >= quantia && quantia > 0) {
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println(this.nome + " transferiu " + quantia + " de vida para " + zumbiAlvo.nome);
        } else {
            System.out.println("Transferência inválida. " + this.nome + " não tem vida suficiente!");
        }
    }
}
