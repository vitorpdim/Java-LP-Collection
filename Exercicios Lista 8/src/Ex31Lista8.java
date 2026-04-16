import java.util.Scanner;

public class Ex31Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scTexto = new Scanner(System.in);

        int n;
        String temp;

        do {
            System.out.print("Digite a quantidade de palavras (N <= 10): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 10);

        String[] am = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            am[i] = scTexto.nextLine();
        }

        System.out.println("\nVetor Original:");
        System.out.print("Vetor AM [ ");
        for (int i = 0; i < n; i++) {
            System.out.print("\"" + am[i] + "\" ");
        }
        System.out.println("]");
        System.out.println("(vetor original - " + n + " elementos)");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (am[i].compareToIgnoreCase(am[j]) > 0) {
                    temp = am[i];
                    am[i] = am[j];
                    am[j] = temp;
                }
            }
        }

        System.out.println("\nVetor Ordenado:");
        System.out.print("Vetor AM [ ");
        for (int i = 0; i < n; i++) {
            System.out.print("\"" + am[i] + "\" ");
        }
        System.out.println("]");
        System.out.println("(vetor ordenado - " + n + " elementos)");
    }
}

// -- Victor Hugo dos Santos -- //