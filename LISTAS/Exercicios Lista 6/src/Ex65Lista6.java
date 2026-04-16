import java.util.Scanner;

public class Ex65Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int termos, i, j, contadorDivisores;

        double fatorial = 1;
        int numeroPrimo = 2;
        double resultado = 0;
        double termoAtual;

        System.out.print("Digite a quantidade de termos: ");
        termos = sc.nextInt();

        System.out.print("Sequencia: ");

        for (i = 0; i < termos; i++) {
            if (i > 0) {
                fatorial = fatorial * i;
            }

            if (i > 0) {
                numeroPrimo++;
                while (true) {
                    contadorDivisores = 0;
                    for (j = 1; j <= numeroPrimo; j++) {
                        if (numeroPrimo % j == 0) {
                            contadorDivisores++;
                        }
                    }

                    if (contadorDivisores == 2) {
                        break;
                    } else {
                        numeroPrimo++;
                    }
                }
            }

            termoAtual = fatorial / numeroPrimo;
            if (i % 2 == 0) {
                termoAtual = termoAtual * -1;
                System.out.print(fatorial + "/" + numeroPrimo + " * (-1) ");
            } else {
                System.out.print(" + " + fatorial + "/" + numeroPrimo + " ");
            }

            resultado += termoAtual;
        }

        System.out.println("\n\nSoma dos termos: " + resultado);
    }
}

// -- Victor Hugo dos Santos -- //