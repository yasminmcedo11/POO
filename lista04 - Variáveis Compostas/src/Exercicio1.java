import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        int numero;
        float media = 0;
        float[] notas, controle;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de alunos na turma: ");
        numero = teclado.nextInt();

        notas = new float[numero];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno: ");
            notas[i] = teclado.nextFloat();
        }
        teclado.close();

        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media = media/numero;

        controle = new float[numero];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                controle[i] = notas[i];
            }
        }
        
        System.out.printf("A média da turma foi %.2f \n", media);
        System.out.println("As notas acima da média foram: ");
        for (int i = 0; i < notas.length; i++) {
            if (controle[i] != 0.0f) {
                System.out.println(controle[i]);
            }
        }
    }
}
