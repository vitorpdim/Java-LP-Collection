import java.util.Scanner;

public class Ex34Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, termo;

        do {
            System.out.print("Entre com a quantidade de termos (0 para sair): ");
            quantidade = sc.nextInt();

            if (quantidade < 0) {
                System.out.println("Numero invalido. Tente novamente.");
            } else if (quantidade > 0) {
                termo = 0;
                for (int i = 0; i < quantidade; i++) {
                    System.out.print(termo + " ");
                    termo = termo + (i + 1);
                }
                System.out.println("\n");
            }
        } while (quantidade != 0);

        System.out.println("Fim do programa");
    }
}

// -- Victor Hugo dos Santos -- //