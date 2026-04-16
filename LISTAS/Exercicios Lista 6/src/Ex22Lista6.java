import java.util.Scanner;

public class Ex22Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, i;
        double preco, maiorPreco = 0, somaPreco = 0, media;

        for (i = 1; i <= 15; i++) {

            System.out.println("Produto " + i + ":");
            System.out.print("Entre com o codigo: ");
            codigo = sc.nextInt();

            System.out.print("Entre com o preco: ");
            preco = sc.nextDouble();

            if (i == 1) {
                maiorPreco = preco;
             } else if (preco > maiorPreco) {
                maiorPreco = preco;
            }

            // Acumula para a média
            somaPreco = somaPreco + preco;
        }

        media = somaPreco / 15;

         System.out.println("\n--- Resultados ---");
        System.out.println("O maior preco lido foi: " + maiorPreco);
        System.out.println("A media dos precos eh: " + media);
    }
}

// -- Victor Hugo dos Santos -- //