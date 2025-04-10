import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int l1, l2, l3;

        System.out.println("Digite o valor dos lados do triangulo: ");
        l1 = teclado.nextInt();
        l2 = teclado.nextInt();
        l3 = teclado.nextInt();
        teclado.close();

        if (l1 == l2 && l2 == l3 && l1 == l3) {
            System.out.println("É equilatero");
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            System.out.println("É isosceles");
        } else {
            System.out.println("É escaleno");
        }
    }  
}
