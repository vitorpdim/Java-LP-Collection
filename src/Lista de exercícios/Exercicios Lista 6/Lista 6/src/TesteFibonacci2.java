import java.util.Scanner;

public class TesteFibonacci2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = 0, b = 1, c = a + b, valorFinal;

        System.out.print("Entre com o termo final: ");
        valorFinal = sc.nextInt();

        while (a <= valorFinal){

            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
