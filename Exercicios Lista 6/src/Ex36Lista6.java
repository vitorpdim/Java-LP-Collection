import java.util.Scanner;

public class Ex36Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;

        do {
            System.out.print("Entre com a quantidade de termos (0 para sair): ");
            quantidade = sc.nextInt();

            if (quantidade < 0) {
                System.out.println("Numero invalido. Tente novamente.");
            } else if (quantidade > 0) {
                for (int i = 1; i <= quantidade; i++) {
                    if (i == 1) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("1/" + i + " ");
                    }
                }
                System.out.println("\n");
            }
        } while (quantidade != 0);

        System.out.println("Fim do programa");
    }
}

// -- Victor Hugo dos Santos -- //