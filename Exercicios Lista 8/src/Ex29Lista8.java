import java.util.Scanner;

public class Ex29Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, chute, temp;
        boolean acertou = false;

        do {
            System.out.print("Digite o tamanho do vetor (>= 10): ");
            n = sc.nextInt();
        } while (n < 10);

        int[] aj = new int[n];

        for (int i = 0; i < n; i++) {
            boolean repetido;
            int novoValor;
            do {
                repetido = false;
                novoValor = (int) (Math.random() * 100) + 1;

                for (int j = 0; j < i; j++) {
                    if (aj[j] == novoValor) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            aj[i] = novoValor;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (aj[i] > aj[j]) {
                    temp = aj[i];
                    aj[i] = aj[j];
                    aj[j] = temp;
                }
            }
        }

        System.out.println("\n--- JOGO DA ADIVINHACAO ---");
        System.out.println("\n");
        System.out.println("Tente adivinhar um numero do vetor (valores entre 1 e 100).");
        System.out.println("vc tem 10 tentativas.");

        for (int tentativa = 1; tentativa <= 10; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": ");
            chute = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (aj[i] == chute) {
                    System.out.println("\nPARABENS! Voce encontrou o numero " + chute + " na posicao " + i + " do vetor ordenado.");
                    acertou = true;
                    break;
                }
            }

            if (acertou) {
                break;
            } else {
                System.out.println("nao ta no vetor!");
            }
        }

        if (!acertou) {
            System.out.println("\nvc perdeu! Nao acertou nenhum numero burro pa carai");
        }

        System.out.print("\nVetor AJ completo: ");
        for (int i = 0; i < n; i++) {
            System.out.print(aj[i] + " ");
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //