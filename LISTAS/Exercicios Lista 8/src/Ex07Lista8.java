import java.util.Scanner;


public class Ex07Lista8 {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);

        int n;

        do {
            n = leia.nextInt();

            if (n < 1 || n > 10){

                System.out.println("Valor inválido, faça novamnete: ");
            }

        } while (n > 20 || n < 1);

        int vetor1[];

        vetor1 = new int[n];
        int menor = vetor1[0];

        for (int i = 0; i < n; i++){
            vetor1[i] = leia.nextInt();
            System.out.println("Digite algum valor: " + vetor1[i]);

            if (vetor1[i] < menor){
                menor = Math.min(menor, vetor1[i]);

            }


        }

        System.out.println("O menor valor digitado é:" + menor);

    }
}
// -- Victor Hugo dos Santos -- //