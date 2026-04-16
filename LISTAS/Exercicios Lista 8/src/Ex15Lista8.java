import java.util.Scanner;
import java.util.Random;

public class Ex15Lista8 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();

        int n = 0;

        int m = 0;


        System.out.println("Escreva o tamanho do primeiro elemento: ");
        do {
            n = leia.nextInt();

            if (n > 10){
                System.out.println("número inválido! escreva novamente");

            }

        } while (n > 10);



        System.out.println("Escreva o tamanho do segundo elemento:");
        do {
            m = leia.nextInt();



            if (m > 15){
                System.out.println("número inválido! escreva novamente");

            }

        } while (m > 15);

        System.out.println("Os resultados do primeiro elemento é");
        int S[] = new int[n];
        for (int i = 0; i < n ; i++){
            S[i] = aleatorio.nextInt(10);

            System.out.print(S[i] + " ");

        }

        System.out.println(" ");

        System.out.println("Os resultados do segundo elemento é");
        int T[] = new int[m];
        for (int i = 0; i < m; i++){
            T[i] = aleatorio.nextInt(10);

            System.out.print(T[i] + " ");
        }

        System.out.println(" ");

        System.out.println("O resultado de R é: ");

        int[] U = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            U[k++] = S[i++];
            U[k++] = T[j++];
        }

        while (i < n) {
            U[k++] = S[i++];
        }

        while (j < m) {
            U[k++] = T[j++];
        }

        for (int x = 0; x < U.length; x++) {
            System.out.print(U[x] + " ");
        }

    }
}
// -- Victor Hugo dos Santos -- //