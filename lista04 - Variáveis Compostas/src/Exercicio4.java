import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int decisao;
        int[] idades;
        String[] nomes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as idades: ");
        idades = new int[10];
        nomes = new String[10];
        for (int i = 0; i < idades.length; i++) {
            idades[i] = teclado.nextInt();
        }
        teclado.nextLine();

        System.out.println("Digite os nomes: ");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = teclado.nextLine();
        }

        System.out.println("Digite 1 para ordenar por idade e 2 para ordenar por ordem alfabetica: ");
        decisao = teclado.nextInt();
        teclado.close();
        switch (decisao) {
            case 1:
                for (int i = 0; i < idades.length; i++) {
                    for (int j = 0; j < idades.length - 1 - i; j++) {
                        if (idades[j] > idades[j + 1]) {
                            int tempIdade = idades[j];
                            idades[j] = idades[j + 1];
                            idades[j + 1] = tempIdade;

                            String temp = nomes[j];
                            nomes[j] = nomes[j + 1];
                            nomes[j + 1] = temp;
                        }
                    }
                }
                break;
        
            case 2:
                for (int i = 0; i < nomes.length - 1; i++) {
                    for (int j = 0; j < nomes.length - 1 - i; j++) {
                        if (nomes[j].compareToIgnoreCase(nomes[j + 1]) > 0) {
                            String temp = nomes[j];
                            nomes[j] = nomes[j + 1];
                            nomes[j + 1] = temp;
                        }
                    }
                }
                break;

            default:
                break;
        }

        System.out.println("Vetor ordenado");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}



