import java.util.Scanner;

public class Ex06Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior valor e: " + valor1);
        } else {
            System.out.println("O maior valor e: " + valor2);
        }
    }
}

// -- Victor Hugo dos Santos -- //