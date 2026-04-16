import java.util.Scanner;

public class Ex10Lista7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "";
        int contador = 0;

        System.out.println("Entre com uma frase: ");
        frase = sc.nextLine();

        for (int posicao = 0; posicao < frase.length(); posicao++){
            if (frase.charAt(posicao) >= 'A' && frase.charAt(posicao) >= 'Z'){
                contador++;
            }
        }
        System.out.println("\nQuantidade de letras maiusculas: " + contador);
    }
}
// -- Victor Hugo dos Santos --