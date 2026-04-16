import java.util.Scanner;

public class Ex55Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, soma = 0;

        System.out.print("Digite um numero inteiro: ");
        numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        if (soma == numero && numero != 0) {
            System.out.println(numero + " eh um numero perfeito.");
        } else {
            System.out.println(numero + " nao eh um numero perfeito.");
        }
    }
}

// -- Victor Hugo dos Santos -- //