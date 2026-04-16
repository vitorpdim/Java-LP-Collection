import java.util.Scanner;

public class Ex03Lista8 {
    public static void main(String[] args){
        Scanner leia = new Scanner (System.in);

        int n;

        do {
            n = leia.nextInt();
            System.out.print("Digite o número de posições (1 a 20): ");

            if (n < 1 || n > 20){

                System.out.println("Valor inválido! Digite um número entre 1 e 20.");
            }

        } while (n < 1 || n > 20);


        int vetor [] = new int [n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = leia.nextInt();
        }

        for (int i = 0; i < n; i++){
            System.out.println(vetor[i] + " ");

        }



        System.out.println();



    }
}
// -- Victor Hugo dos Santos -- //