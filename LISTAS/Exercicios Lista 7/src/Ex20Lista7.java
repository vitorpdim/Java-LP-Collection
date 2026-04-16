import java.util.Scanner;

public class Ex20Lista7 {
    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            String frase = "";
            int contador = 0;

            System.out.print("Entre com uma frase: ");
            frase = leia.nextLine();

            String[] palavras = frase.split(" ");
            System.out.println("\nQuantidade de palavras: " + palavras.length);
        }
    }
// -- Victor Hugo dos Santos --