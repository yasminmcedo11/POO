import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, k, p, guardado;
        int[] v;

        System.out.println("Digite o tamanho do vetor: ");
        n = teclado.nextInt();

        v = new int[n];
        System.out.println("Digite os números: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = teclado.nextInt();
        }

        System.out.println("Digite o número que deseja inserir: ");
        k = teclado.nextInt();
        System.out.println("Digite a posição que deseja inserir: ");
        p = teclado.nextInt();
        teclado.close();

        if (p > v.length-1) {
            System.out.println("Posição Inválida.");
        } else {
            guardado = v[p];
            v[p] = k;
            for (int i = v.length-1; i > p+1; i--) {
                v[i] = v[i-1];
                System.out.println("i = " + i);
            }
            v[p + 1] = guardado;

            System.out.println("Vetor após alterações: ");
            for (int i = 0; i < v.length; i++) {
                System.out.println(v[i]);
            }
        }

    }
}
