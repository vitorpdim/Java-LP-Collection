import java.util.Random;


public class Ex11Lista8 {
    public static void main(String[] args){
        Random aleatorio = new Random();

        int vetorQA[] = new int[5];
        int vetorQB[] = new int[5];
        int vetorQC[] []= {vetorQA, vetorQB};

        System.out.print("Os números de QA são: ");
        for (int i = 0; i < vetorQA.length; i++){
            vetorQA[i] = aleatorio.nextInt(10);

            System.out.print(vetorQA[i] + ", ");

        }

        System.out.println();

        System.out.print("Os números de QB são: ");
        for (int i = 0; i < vetorQB.length; i++){
            vetorQB[i] = aleatorio.nextInt(10);

            System.out.print(vetorQB[i] + ", ");
        }

        System.out.println("\n\nOs números de QC são:");
        for (int i = 0; i < vetorQC.length; i++) {
            System.out.print("Linha " + i + ": ");
            for (int j = 0; j < vetorQC[i].length; j++) {
                System.out.print(vetorQC[i][j] + " ");
            }
            System.out.println();
        }




    }
}
// -- Victor Hugo dos Santos -- //