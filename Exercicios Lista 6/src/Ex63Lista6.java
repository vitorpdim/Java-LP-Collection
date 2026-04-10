import java.util.Scanner;

public class Ex63Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, a, b, aux, primo, divisores;
        double soma;

        do {
            System.out.print("Entre com a quantidade de termos: ");
            quantidade = sc.nextInt();

            if (quantidade > 0) {
                a = 0;
                b = 1;
                primo = 2;
                soma = 0;

                System.out.print("Sequencia: ");

                for (int i = 1; i <= quantidade; i++) {

                    System.out.print(b + "/" + primo);
                    soma += (double) b / primo;

                    if (i < quantidade) {
                        System.out.print(" + ");
                    }

                    aux = a + b;
                    a = b;
                    b = aux;

                    do {
                        primo++;
                        divisores = 0;
                        for (int j = 1; j <= primo; j++) {
                            if (primo % j == 0) {
                                divisores++;
                            }
                        }
                    } while (divisores != 2);
                }
                System.out.println("\nSoma: " + soma + "\n");
            }

        } while (quantidade > 0);
    }
}

// -- Victor Hugo dos Santos -- //