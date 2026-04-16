import java.util.Scanner;

public class Ex12lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] P = new int[10], Q = new int[15];
        int[] R = new int[25];

        for (int i = 0; i < P.length; i++) {

            System.out.print("Entre com os valores do array P: [ " + i + " / 10]: ");
            P[i] = sc.nextInt();
            R[i] = P[i];

        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < Q.length; i++) {

            System.out.print("Entre com os valores do array Q: [ " + i + " / 15]: ");
            Q[i] = sc.nextInt();
            R[i + 10] = Q[i];

        }

        System.out.println();
        System.out.println(" ============ ARRAY R CONCATENADO GERADO ===========");

        for(int i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }
    }
}
// -- Victor Hugo dos Santos -- //