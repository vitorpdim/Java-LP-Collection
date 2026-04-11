import java.util.Scanner;

public class Ex05Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase = "";
        int contador = 0;

        System.out.print("Escreva uma palavra: ");
        frase = leia.nextLine();


        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador++;

            }
        }

        System.out.println("A sua frase contem: " + contador + " A's");
    }
}
// -- Victor Hugo dos Santos --