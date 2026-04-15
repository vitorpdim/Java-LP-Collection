import java.util.Scanner;
import java.util.Random;

public class Ex13Lista8 {
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
        int P[] = new int[n];
        for (int i = 0; i < n ; i++){
            P[i] = aleatorio.nextInt(10);

            System.out.print(P[i] + " ");

        }

        System.out.println(" ");

        System.out.println("Os resultados do segundo elemento é");
        int q[] = new int[m];
        for (int i = 0; i < m; i++){
            q[i] = aleatorio.nextInt(10);

            System.out.print(q[i] + " ");
        }

        System.out.println(" ");

        System.out.println("O resultado de R é: ");

        int  R[] [] = {P, q};
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }







    }
}
// -- Victor Hugo dos Santos -- //