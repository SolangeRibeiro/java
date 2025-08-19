public class Main {
    public static void main(String[] args) {
        // Criando dois zumbis
        Zumbi z1 = new Zumbi("Zumbi A", 100);
        Zumbi z2 = new Zumbi("Zumbi B", 50);

        // Mostrando vida inicial
        System.out.println(z1.nome + " tem " + z1.mostraVida() + " de vida.");
        System.out.println(z2.nome + " tem " + z2.mostraVida() + " de vida.");

        // Manipulando individualmente
        z1.vida -= 20; // Zumbi A perde 20 de vida
        z2.vida += 10; // Zumbi B ganha 10 de vida

        System.out.println("\nApós manipulação:");
        System.out.println(z1.nome + " tem " + z1.mostraVida() + " de vida.");
        System.out.println(z2.nome + " tem " + z2.mostraVida() + " de vida.");

        // Fazendo as variáveis de referência iguais
        z1 = z2;

        // Manipulando novamente
        z1.vida -= 15; // como z1 e z2 aponta para o mesmo objeto, os dois mudam

        System.out.println("\nApós z1 = z2 e manipulação:");
        System.out.println("z1 (" + z1.nome + ") tem " + z1.mostraVida() + " de vida.");
        System.out.println("z2 (" + z2.nome + ") tem " + z2.mostraVida() + " de vida.");
    }
}
