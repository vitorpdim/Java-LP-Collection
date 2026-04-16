import java.util.Scanner;

public class Ex57Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade, cont = 0;
        long numero = 1;

        System.out.print("Quantos numeros perfeitos deseja encontrar: ");
        quantidade = sc.nextInt();

        while (cont < quantidade) {
            long soma = 0;

            for (long i = 1; i <= (numero / 2); i++) {
                if (numero % i == 0) {
                    soma += i;
                }
            }

            if (soma == numero) {
                System.out.print(numero + " ");
                cont++;
            }
            numero++;
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //