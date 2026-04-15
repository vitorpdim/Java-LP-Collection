import java.util.Scanner;

public class Ex18Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Entre com a quantidade de elementos: ");
            n = sc.nextInt();

            if (n > 15 || n <= 0 ){
                System.out.println("\n ERRO! entre com uma quantidade entre 1 e 15!!");
            }

        }while (n > 15 || n <= 0 );

        int[] fatoriais = new int[n];

        for (int f = 0; f < fatoriais.length; f++){

            int numero = f + 1;

            fatoriais [f] = 1;
            for ( int i = 1; i <= numero; i++){

                fatoriais[f] *= i;

            }
            System.out.println(fatoriais[f] + " " );
        }

    }
}
// -- Victor Hugo dos Santos -- //