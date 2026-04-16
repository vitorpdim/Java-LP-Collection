import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Ex21Lista8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();

        int AB[] = new int[10];

        for (int i = 0; i < AB.length; i++) {
            AB[i] = aleatorio.nextInt(10);
            System.out.print(AB[i] + " ");
        }

        System.out.println("\n");

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int n : AB) {
            if (n % 2 == 0) qtdPares++;
            else qtdImpares++;
        }

        int pares[] = new int[qtdPares];
        int impares[] = new int[qtdImpares];

        int iPar = 0;
        int iImpar = 0;

        for (int n : AB) {
            if (n % 2 == 0) {
                pares[iPar] = n;
                iPar++;
            } else {
                impares[iImpar] = n;
                iImpar++;
            }
        }

        System.out.println("Vetor de pares: " + Arrays.toString(pares));
        System.out.println("Vetor de impares: " + Arrays.toString(impares));
    }
}
// -- Victor Hugo dos Santos -- //