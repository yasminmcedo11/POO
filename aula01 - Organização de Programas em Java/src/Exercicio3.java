import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = teclado.nextInt();
        teclado.close();

        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par.");
        } else {
            System.out.println("O número " + n + " é ímpar.");
        }

    }
}
