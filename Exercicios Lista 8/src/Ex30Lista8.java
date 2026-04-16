import java.util.Scanner;

public class Ex30Lista8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = 0;

        double temp;

        System.out.print("\n\nEntre com o tamanho do vetor: ");

        tamanho = sc.nextInt();

        double ak[] = new double[tamanho];

        System.out.print("\n\nEntre com os elementos do vetor: ");
        for (int i = 0; i < ak.length; i++) {
            System.out.println("Vetor ak[" + i + "]: ");
            ak[i] = sc.nextDouble();
        }

        // ordem do vetor:
        for (int j = 0; j < ak.length - 1; j++) {
            for (int i = 0; i < ak.length - 1; i++) {
                if (ak[i] > ak[i + 1]) {

                    temp = ak[i];
                    ak[i] = ak[i + 1];
                    ak[i + 1] = temp;
                }
            }
        }

        System.out.print("\n\nArray ordenado: ");
        for (int i = 0; i < ak.length; i++) {
            System.out.println(ak[i] + " ");
        }

        double al[] = new double[2 * tamanho - 1];


        for (int i = 0, j = 0; i < al.length; i += 2, j++) {

            ak[1] = ak[j];
            if (i < 0){
                al[i - 1] = (al[i] + al[i - 2])/ 2;
            }

        }
        System.out.print("\n\nArray com medias: ");
        for (int i = 0; i < al.length; i += 2) {

            System.out.println(al[i] + " ");
        }
    }
}
// -- Victor Hugo dos Santos -- //