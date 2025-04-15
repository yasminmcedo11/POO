import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int codigo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o codigo: ");
        codigo = teclado.nextInt();

        while (codigo != -1) {
            System.out.println("Codigo: " + codigo);
            System.out.println("Digite o codigo: ");
            codigo = teclado.nextInt();
        }

        teclado.close();
    }
}
