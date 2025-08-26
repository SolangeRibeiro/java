import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] campoMinado;
        campoMinado = new int[2][2];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int linha = rand.nextInt(2);
        int coluna = rand.nextInt(2);
        campoMinado[linha][coluna] = 1;

        boolean vencedor = false;

        while (vencedor == false) {
            System.out.print("linha: ");
            int linha2 = sc.nextInt();
            System.out.print("coluna: ");
            int coluna2 = sc.nextInt();

            if (campoMinado[linha2][coluna2] == 1) {
                System.out.println("Você pisou em uma mina");
                vencedor = true;
            } else {
                System.out.println("sem mina");
                vencedor = false;
            }
        }
    }
}
