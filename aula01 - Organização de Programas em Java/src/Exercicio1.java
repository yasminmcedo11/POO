import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();
        teclado.close();

        System.out.println("Olá, " + nome + ". Bem vindo ao Java!");
    }
    
}
