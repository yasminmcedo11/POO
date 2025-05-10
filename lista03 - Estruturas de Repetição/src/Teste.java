import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        String palavra = new String();
        String palavraAlterada = new String();
        int contagemA = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a palavra ou frase que deseja analisar: ");
        palavra = teclado.nextLine();
        teclado.close();

        palavraAlterada = palavra.replace(" ", "");
        int totalCaracteres = palavraAlterada.length();
        System.out.println("A palavra " + palavra + " tem " + totalCaracteres + " caracteres.");

        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a') {
                contagemA += 1;
            }
        }

        System.out.println("A letra A aparece " + contagemA + " vezes.");
    }
}
