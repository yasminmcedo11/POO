import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int horas = 0, minutos = 0, segundos = 0;

        System.out.println("Digite a quantidade de segundos: ");
        int t = teclado.nextInt();
        teclado.close();

        if (t > 3600) {
            horas = t/3600;
            t = t - horas*3600;
            minutos = t/60;
            t = t - minutos*60;
            segundos = t;
        } else if (t > 60){
            minutos = t/60;
            t = t - minutos*60;
            segundos = t;
        } else {
            segundos = t;
        }

        System.out.println(horas + "h, " + minutos + "min, " + segundos + "s.");

    }
}
