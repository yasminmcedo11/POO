import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float distancia, velocidade, consumo;
        int tempo, qtdConsumida;

        System.out.println("Digite a distancia percorrida (em km), o tempo (em h) e o consumo (em l)");
        distancia = teclado.nextFloat();
        tempo = teclado.nextInt();
        qtdConsumida = teclado.nextInt();
        teclado.close();

        velocidade = distancia/tempo;
        consumo = distancia/qtdConsumida;

        System.out.println("velocidade = " + velocidade + "km/h");
        System.out.println("Consumo  = " + consumo + "km/l");
    }
}
