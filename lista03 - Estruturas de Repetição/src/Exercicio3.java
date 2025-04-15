import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        int codigo;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe o codigo: ");
            codigo = teclado.nextInt();
            if (codigo != -1) {
                System.out.println("Código: " + codigo);
            }
        } while (codigo != -1);

        teclado.close();
    }
}
