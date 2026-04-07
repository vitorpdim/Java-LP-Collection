import java.util.Scanner;

public class Ex39Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        double soma;

        do {
            System.out.print("Entre com a quantidade de termos (0 para sair): ");
            quantidade = sc.nextInt();

            if (quantidade < 0) {
                System.out.println("Numero invalido. Tente novamente.");
            } else if (quantidade > 0) {
                soma = 0;
                for (int i = 1; i <= quantidade; i++) {
                    int numerador = i;
                    int denominador = quantidade - i + 1;

                    System.out.print(numerador + "/" + denominador);

                    if (i < quantidade) {
                        System.out.print(" + ");
                    }

                    soma += (double) numerador / denominador;
                }
                System.out.println("\nSoma da sequencia: " + soma + "\n");
            }
        } while (quantidade != 0);

        System.out.println("Fim do programa");
    }
}

// -- Victor Hugo dos Santos -- //