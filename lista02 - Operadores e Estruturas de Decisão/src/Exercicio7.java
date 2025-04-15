import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n, maior, menor, n1, n2;

        System.out.println("Digite o numero e os 2 valores do intervalo: ");
        n = teclado.nextInt();
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        teclado.close();

        maior = Math.max(n1, n2);
        menor = Math.min(n1, n2);

        if (n >= menor && n <= maior) {
            System.out.println("Está dentro do intervalo");
        } else if (n < menor) {
            System.out.println("Está antes do intervalo");
        } else if (n > maior) {
            System.out.println("Está depois do intervalo");
        }
    } 
}
