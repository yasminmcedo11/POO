import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int qtd;
        float preco, desconto;

        System.out.println("Digite os dados dos produtos: ");
        nome = teclado.nextLine();
        qtd = teclado.nextInt();
        preco = teclado.nextFloat();
        teclado.close();

        if (qtd <= 10) {
            System.out.printf("%s - R$ %.2f\n", nome, preco);
        } else if (qtd <= 20) {
            desconto = preco * 0.10f;
            preco = preco - desconto;
            System.out.printf("%s - R$ %.2f\n", nome, preco);
        } else if (qtd <= 50) {
            desconto = preco * 0.20f;
            preco = preco - desconto;
            System.out.printf("%s - R$ %.2f\n", nome, preco);
        } else {
            desconto = preco * 0.25f;
            preco = preco - desconto;
            System.out.printf("%s - R$ %.2f\n", nome, preco);
        }
    } 
}
