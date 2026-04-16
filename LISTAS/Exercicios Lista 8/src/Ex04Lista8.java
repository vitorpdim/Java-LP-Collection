import java.util.Scanner;

public class Ex04Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {

            System.out.print("\nEntre com a quantidade de termos do array: ");
            n = sc.nextInt();

            if(n > 20 || n <= 0){
                System.out.println("\n\t\nERRO!!! entre com um numero entre 1 e 20");
            }

        }while(n > 20 || n <= 0);

        int[] D = new int[n];

        for (int i = 0; i < D.length; i++){

            System.out.print("Entre com os valores[" + ( i + 1) + " / " + n + "]: ");
            D[i] = sc.nextInt();
        }

        System.out.print("\n\n");
        for (int i = 0; i < D.length; i++){

            System.out.print("Seu array: " + D[i] + " ");

        }
    }
}
// -- Victor Hugo dos Santos -- //