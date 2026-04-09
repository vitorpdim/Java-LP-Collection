import java.util.Scanner;

public class Ex60Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, numVerificar;
        boolean pertence = false;

        System.out.print("Entre com o primeiro termo: ");
        a = sc.nextInt();

        System.out.print("Entre com o segundo termo: ");
        b = sc.nextInt();

        System.out.print("Entre com o numero para verificar: ");
        numVerificar = sc.nextInt();

        if (a == numVerificar || b == numVerificar) {
            pertence = true;
        } else {
            c = a + b;
            while (c <= numVerificar) {
                if (c == numVerificar) {
                    pertence = true;
                    break;
                }
                a = b;
                b = c;
                c = a + b;
            }
        }

        if (pertence) {
            System.out.println("O numero " + numVerificar + " pertence a sequencia.");
        } else {
            System.out.println("O numero " + numVerificar + " nao pertence a sequencia.");
        }
    }
}

// -- Victor Hugo dos Santos -- //