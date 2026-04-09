import java.util.Scanner;

public class Ex58Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Entre com o primeiro termo: ");
        a = sc.nextInt();

        System.out.print("Entre com o segundo termo: ");
        b = sc.nextInt();

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //