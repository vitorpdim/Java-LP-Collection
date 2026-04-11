import java.util.Scanner;

public class Ex12Lista7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "", vogais = "aeiou";
        int contador = 0;

        System.out.println("Entre com uma frase: ");
        frase = sc.nextLine();

        frase = frase.toLowerCase();

        for (int posicao = 0; posicao < frase.length(); posicao++){
            for (int vogal = 0; vogal < vogais.length(); vogal++) {

                if (frase.charAt(posicao) == vogais.charAt(vogal)) {
                    contador++;
                }
            }
        }
        System.out.println("\nQuantidade de vogais: " + contador);
    }
}
// -- Victor Hugo dos Santos --