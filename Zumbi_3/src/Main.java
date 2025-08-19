public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi("Zumbi A", 100);
        Zumbi z2 = new Zumbi("Zumbi B", 50);

        System.out.println(z1.nome + " tem " + z1.mostraVida() + " de vida.");
        System.out.println(z2.nome + " tem " + z2.mostraVida() + " de vida.");

        // Testando transferência válida
        boolean sucesso = z1.transfereVida(z2, 30);
        System.out.println("Transferência realizada? " + sucesso);

        // Testando transferência inválida
        boolean falha = z1.transfereVida(z2, 200);
        System.out.println("Transferência realizada? " + falha);

        System.out.println(z1.nome + " tem " + z1.mostraVida() + " de vida.");
        System.out.println(z2.nome + " tem " + z2.mostraVida() + " de vida.");
    }
}
