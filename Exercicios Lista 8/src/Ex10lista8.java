import java.util.Scanner;

public class Ex10lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] PA = new int[5], PB = new int[5];
        int[] PC = new int[10];

        for (int i = 0; i < PA.length; i++) {

            System.out.print("Entre com os 5 valores do array PA: ");
            PA[i] = sc.nextInt();
            PC[i] = PA[i];

        }

        for (int i = 0; i < PB.length; i++) {

            System.out.print("Entre com mais 5 valores do array PB: ");
            PB[i] = sc.nextInt();
            PC[i + 5] = PB[i];
        }

        System.out.println();
        System.out.println(" ============ ARRAYS GERADOS ===========");

        for (int i = 0; i < PC.length; i++) {
            System.out.print(PC[i] + " ");
        }
    }
}
// -- Victor Hugo dos Santos -- //