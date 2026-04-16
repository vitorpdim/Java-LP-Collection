import java.util.Scanner;

public class Ex06Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entre com a quantidade de elementos (max 15): ");
            n = sc.nextInt();
            if (n > 15 || n <= 0) {
                System.out.println("ERRO! digite um valor entre 1 e 15");
            }
        } while (n > 15 || n <= 0);

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("\n--- ARRAY A ---");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        System.out.println("\n--- ARRAY B ---");
        for (int i = 0; i < n; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        boolean achouIgual = false;

        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) {
                System.out.println("VALORES IGUAIS EM: " + i + " (Valor: " + A[i] + ")");
                achouIgual = true;
            }
        }

        if (achouIgual == false) {
            System.out.println("nenhum elemento igual encontrado");
        }
    }
}
// -- Victor Hugo dos Santos -- //