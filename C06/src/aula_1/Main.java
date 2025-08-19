package aula_1;

public class Main {
    public static void main(String[] args) {
        // Criando dois zumbis
        Zumbi Zumbi1 = new Zumbi("Zumbi A", 100);
        Zumbi Zumbi2 = new Zumbi("Zumbi B", 50);

        // Mostrando vida inicial

        System.out.println(Zumbi1.nome + " tem " + Zumbi1.mostraVida() + " de vida.");
        System.out.println(Zumbi2.nome + " tem " + Zumbi2.mostraVida() + " de vida.");

        // Transferindo vida
        Zumbi1.transfereVida(Zumbi2, 30);

        // Mostrando vida após transferência
        System.out.println(Zumbi1.nome + " tem " + Zumbi1.mostraVida() + " de vida.");
        System.out.println(Zumbi2.nome + " tem " + Zumbi2.mostraVida() + " de vida.");
    }
}
