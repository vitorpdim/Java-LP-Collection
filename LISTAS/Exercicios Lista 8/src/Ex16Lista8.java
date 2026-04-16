import java.util.Scanner;

public class Ex16Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantidade de termos (N <= 20): ");
            n = sc.nextInt();

            if (n <= 0 || n > 20) {
                System.out.println("Erro: O numero deve ser positivo e menor ou igual a 20.");
            }
        } while (n <= 0 || n > 20);

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                v[i] = 1;
            } else {
                v[i] = v[i - 1] + v[i - 2];
            }
        }

        System.out.print("Vetor V (Fibonacci): ");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //