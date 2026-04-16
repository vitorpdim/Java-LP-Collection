import java.util.Scanner;
import java.util.Arrays;

public class Ex32Lista8 {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        String frase;

            System.out.print("\nEntre com uma frase: ");
            frase = scStr.nextLine();

            String[] vetorAN = frase.split(" ");

        System.out.print("\nQuantidade de palavras: " + vetorAN.length);
        System.out.println();
        System.out.println();
        System.out.print("\nVetor original: ");
        for (int i = 0; i < vetorAN.length; i++){
            System.out.print(vetorAN[i] + " ");
        }
        System.out.print("\n\t(vetor original) - " + vetorAN.length + " elementos");

        Arrays.sort(vetorAN);
        System.out.println();

        System.out.print("\nVetor ordenado: ");
        for (int i = 0; i < vetorAN.length; i++){
            System.out.print(vetorAN[i] + " ");

        }
        System.out.print("\n\t(vetor ordenado) - " + vetorAN.length + " elementos");
        System.out.println();
    }
}
// -- Victor Hugo dos Santos -- //