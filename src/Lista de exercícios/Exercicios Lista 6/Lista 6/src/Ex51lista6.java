import java.util.Scanner;

public class Ex51lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, c = a + b, termoFinal;
        System.out.print("Entre com a quantidade de termos da sequencia: ");
        termoFinal = sc.nextInt();

        for (int i = 1; i <= termoFinal; i++){
            System.out.print(a + " ");

            a = b;
            b = c;
            c = a + b;

        }
    }
}
