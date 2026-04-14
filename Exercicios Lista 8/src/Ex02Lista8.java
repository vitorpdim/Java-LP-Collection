import java.util.Scanner;

public class Ex02Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[15];

        for (int i = 0; i < num.length; i++){

            System.out.print("Entre com os valores[" + ( i + 1) + "/ 15]: ");
            num[i] = sc.nextInt();
        }

        System.out.print("\n\n");
        for (int i = num.length - 1; i > 0; i--){

            System.out.print(num[i] + " ");

        }
    }
}
// -- Victor Hugo dos Santos -- //