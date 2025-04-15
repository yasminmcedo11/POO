import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        int numero, c, a = 0, b = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número da serie que deseje calcular: ");
        numero = teclado.nextInt();
        teclado.close();

        for (int i = 0; i <= numero; i++) {
            if (i == 0) {
                System.out.print(a + ", ");
            } else if (i == 1) {
                System.out.print(b + ", ");
            } else {
                c = a + b;
                if (i == numero) {
                    System.out.print(c + ".");
                } else {
                    System.out.print(c + ", ");
                    a = b;
                    b = c;
                }
            }
        }
    }
}
