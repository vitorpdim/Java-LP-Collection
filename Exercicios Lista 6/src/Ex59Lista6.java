import java.util.Scanner;

public class Ex59Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, quantidade;

        System.out.print("Entre com o primeiro termo: ");
        a = sc.nextInt();

        System.out.print("Entre com o segundo termo: ");
        b = sc.nextInt();

        System.out.print("Entre com a quantidade de termos a gerar: ");
        quantidade = sc.nextInt();

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= quantidade; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //