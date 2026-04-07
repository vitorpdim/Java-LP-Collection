import java.util.Scanner;

public class Ex35Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, auxiliar;

        do {
            System.out.print("Entre com a quantidade de termos (0 para sair): ");
            quantidade = sc.nextInt();

            if (quantidade < 0) {
                System.out.println("Numero invalido. Tente novamente.");
            } else if (quantidade > 0) {
                auxiliar = 1;
                for (int i = 1; i <= quantidade; i++) {
                    if (i % 2 != 0) {
                        System.out.print(auxiliar + " ");
                    } else {
                        System.out.print((auxiliar * -1) + " ");
                        auxiliar++;
                    }
                }
                System.out.println("\n");
            }
        } while (quantidade != 0);

        System.out.println("Fim do programa");
    }
}

// -- Victor Hugo dos Santos -- //