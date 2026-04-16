import java.util.Scanner;

public class Ex05Lista8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a;

        int vetor1[];
        int vetor2[];

        System.out.println("Digite um valor menor ou igual a 15");

        do {
            a = leia.nextInt();

            if (a > 15 || a < 1){
                System.out.println("Valor invalido! digite novamente");

            }
        } while (a > 15 || a < 1);

        System.out.println("Valor Valido");

        vetor1 = new int[a];
        vetor2 = new int[a];

        for (int i = 0; i < a; i ++){
            System.out.println("Digite o primeiro valor");
            vetor1[i] = leia.nextInt();

            System.out.println("Digite o segundo valor");
            vetor2[i] = leia.nextInt();

        }

        for (int i = 0; i < a ; i++){
            System.out.println("A soma deles sÃ£o: ");
            System.out.println(vetor1[i] + vetor2[i] + " ");

        }



    }
}
// -- Victor Hugo dos Santos -- //