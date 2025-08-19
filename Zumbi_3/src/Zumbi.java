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

        // Método para transferir vida (agora retorna boolean)
        boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
            if (quantia > 0 && this.vida >= quantia) {
                this.vida -= quantia;
                zumbiAlvo.vida += quantia;
                System.out.println(this.nome + " transferiu " + quantia + " de vida para " + zumbiAlvo.nome);
                return true;
            } else {
                System.out.println("Transferência inválida. " + this.nome + " não tem vida suficiente!");
                return false;
            }
        }
    }

