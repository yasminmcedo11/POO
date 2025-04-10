import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite 2 números: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        teclado.close();

        System.out.println("soma = " + (n1+n2));
        System.out.println("subtracao = " + (n1-n2));
        System.out.println("multiplicacao = " + (n1*n2));
        System.out.println("divisao = " + (n1/n2));
    }
}
