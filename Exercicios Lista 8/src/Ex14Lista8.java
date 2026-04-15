import java.util.Scanner;

public class Ex14Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] S = new int[10], T = new int[15];
        int[] U = new int[25];

        for (int i = 0; i < S.length; i++) {
            System.out.print("Entre com os valores do array S [ " + (i + 1) + " / 10 ]: ");
            S[i] = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < T.length; i++) {
            System.out.print("Entre com os valores do array T [ " + (i + 1) + " / 15 ]: ");
            T[i] = sc.nextInt();
        }

        int k = 0;
        for(int i = 0; i < S.length; i++) {
            U[k] = S[i];
            k++;

            U[k] = T[i];
            k++;
        }

        for (int i = 10; i < T.length; i++) {
            U[k] = T[i];
            k++;
        }

        System.out.println();
        System.out.println(" ============ ARRAY INTERCALADO GERADO ===========");

        for(int i = 0; i < U.length; i++) {
            System.out.print(U[i] + " ");
        }
    }
}

// -- Victor Hugo dos Santos --