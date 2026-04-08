import java.util.Scanner;

public class Ex50Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int termoInicial, quantidade, cont = 0, divisores, numero;

        System.out.print("Entre com o termo inicial: ");
        termoInicial = sc.nextInt();

        System.out.print("Entre com a quantidade de termos: ");
        quantidade = sc.nextInt();

        numero = termoInicial;

        while (cont < quantidade) {
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
            numero++;
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //