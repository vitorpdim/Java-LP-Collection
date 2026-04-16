import java.util.Scanner;

public class Ex40Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;

        do {
            System.out.print("Entre com a quantidade de termos (0 para sair): ");
            quantidade = sc.nextInt();

            if (quantidade < 0) {
                System.out.println("Numero invalido. Tente novamente.");
            } else if (quantidade > 0) {
                int metade = quantidade / 2;

                for (int i = 1; i <= quantidade; i++) {
                    if (i <= metade) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print((quantidade - i + 1) + " ");
                    }
                }
                System.out.println("\n");
            }
        } while (quantidade != 0);

        System.out.println("Fim do programa");
    }
}

// -- Victor Hugo dos Santos -- //