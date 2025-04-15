import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double tf, tc;
        Scanner teclado = new Scanner(System.in);
        teclado.close();

        System.out.println("Digite a temperatura em Celsius: ");
        tc = teclado.nextFloat();
        tf = (tc*1.8) + 32;

        System.out.println(tc + "°C equivalem a " + tf + "°F");
    }
}
