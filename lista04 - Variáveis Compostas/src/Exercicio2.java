import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, k, encontrado = 0;
        boolean tem0 = false;
        int[] numeros, controle;

        System.out.println("Digite o tamanho do vetor: ");
        n = teclado.nextInt();
        
        numeros = new int[n];
        System.out.println("Digite os numeros presentes no vetor: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Digite o número que deseja consultar: ");
        k = teclado.nextInt();
        controle = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == k) {
                controle[i] = i;
                if (i == 0) {
                    tem0 = true;
                }
            }
        }
        teclado.close();

        System.out.printf("O número %d está nas posições: \n", k);
        for (int i = 0; i < controle.length; i++) {
            if (tem0 == true) {
                System.out.println(0);
                tem0 = false;
                encontrado += 1;
            } else if (controle[i] != 0) {
                System.out.println(controle[i]);
                encontrado += 1;
            }
        }
        if (encontrado == 0) {
            System.out.println("Número não encontrado.");
        }
    }
}
