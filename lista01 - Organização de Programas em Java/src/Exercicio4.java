import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int x, moeda1Real = 0, moeda50Cent = 0, moeda25Cent = 0, moeda10Cent = 0, moeda5Cent = 0, moeda1Cent = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor em centavos");
        x = teclado.nextInt();
        teclado.close();

        while (x != 0) {
            if (x < 100) {
                if (x < 50) {
                    if (x < 25) {
                        if (x < 10) {
                            if (x < 5) {
                                x = x - 1;
                                moeda1Cent += 1;
                            } else {
                                x = x - 5;
                                moeda5Cent += 1;
                            }
                        } else {
                            x = x - 10;
                            moeda10Cent += 1;
                        }
                    } else {
                        x = x - 25;
                        moeda25Cent += 1;
                    }
                } else {
                    x = x - 50;
                    moeda50Cent += 1;
                }
            } else {
                x = x - 100;
                moeda1Real += 1;
            }
        }
        
        System.out.println(moeda1Real + " moeda(s) de 1 real, " + moeda50Cent + " moeda(s) de 50 centavos, " 
        + moeda25Cent + " moeda(s) de 25 centavos, " + moeda10Cent + " moeda(s) de 10 centavos, " 
        + moeda5Cent + " moeda(s) de 5 centavos, " + moeda1Cent + " moeda(s) de 1 centavo.");
    }
}
