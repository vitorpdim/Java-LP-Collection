import java.util.Scanner;

public class Ex25Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, contPar = 0, contImpar = 0, temp;

        System.out.print("Digite o tamanho do vetor: ");
        n = sc.nextInt();

        int[] af = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            af[i] = sc.nextInt();

            if (af[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        int[] pares = new int[contPar];
        int[] impares = new int[contImpar];
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            if (af[i] % 2 == 0) {
                pares[x] = af[i];
                x++;
            } else {
                impares[y] = af[i];
                y++;
            }
        }

        for (int i = 0; i < contImpar; i++) {
            for (int j = i + 1; j < contImpar; j++) {
                if (impares[i] > impares[j]) {
                    temp = impares[i];
                    impares[i] = impares[j];
                    impares[j] = temp;
                }
            }
        }

        for (int i = 0; i < contPar; i++) {
            for (int j = i + 1; j < contPar; j++) {
                if (pares[i] < pares[j]) {
                    temp = pares[i];
                    pares[i] = pares[j];
                    pares[j] = temp;
                }
            }
        }

        int k = 0;
        for (int i = 0; i < contImpar; i++) {
            af[k] = impares[i];
            k++;
        }
        for (int i = 0; i < contPar; i++) {
            af[k] = pares[i];
            k++;
        }

        System.out.print("\nVetor AF Ordenado (Impares Crescente / Pares Decrescente): ");
        for (int i = 0; i < n; i++) {
            System.out.print(af[i] + " ");
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //