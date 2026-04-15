import java.util.Scanner;

public class Ex22Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, max = 0;
        do {

            System.out.print("\nEntre com a quantidade de termos do array: ");
            n = sc.nextInt();

            if (n > 20 || n <= 0) {
                System.out.println("\n\t\nERRO!!! entre com um numero entre 1 e 20");
            }

        } while (n > 20 || n <= 0);

        int[] AC = new int[n];

        System.out.print("Entre com o limite maximo dos elementos do array: ");
        max = sc.nextInt();

        System.out.println();

        for (int i = 0; i < AC.length; i++) {

            do {
                System.out.print("Entre com os elementos[ " + (i + 1) + " / " + n + " ]: ");
                AC[i] = sc.nextInt();

                if (AC[i] > max) {
                    System.out.println("\nERRO!! Elemento digitado ultrapassa o tamanho máximo do indice, digite novamente!\n");
                }
            } while (AC[i] > max);
        }

        System.out.println("\n\nSEU ARRAY:");

        System.out.print("\n\n");
        for (int i = 0; i < AC.length; i++) {

            System.out.print(AC[i] + " ");

        }
    }
}
// -- Victor Hugo dos Santos -- //