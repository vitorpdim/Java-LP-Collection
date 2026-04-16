import java.util.Scanner;

public class Ex48Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, cont = 0, numero = 1, divisores;

        System.out.print("Entre com a quantidade de termos primos: ");
        quantidade = sc.nextInt();

        while (cont < quantidade) {
            numero++;
            divisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.print(numero + " ");
                cont++;
            }
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //