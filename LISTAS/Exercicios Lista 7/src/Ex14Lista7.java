import java.util.Scanner;

public class Ex14Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase = "", letra = "", saida = "";
        int contador = 0;

        System.out.print("Entre com uma frase: ");
        frase = leia.nextLine();

        System.out.print("Entre com uma letra: ");
        letra = leia.nextLine();

        frase = frase.toLowerCase();
        for (int indice = 0; indice < frase.length(); indice++) {
            if (frase.charAt(indice) == letra.charAt(0)) {
                saida += '*';
            } else {
                saida += frase.charAt(indice );

            }
        }
        System.out.println("\nSaida: " + saida);
    }
}
// -- Victor Hugo dos Santos --