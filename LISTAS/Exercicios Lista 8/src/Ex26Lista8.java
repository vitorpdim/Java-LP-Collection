import java.util.Scanner;

public class Ex26Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean temImpar = false;

        int n;
        do {
            System.out.print("\nEntre com a quantidade de termos do array: ");
            n = sc.nextInt();

            if (n > 20 || n <= 0) {
                System.out.println("\n\t\nERRO!!! entre com um numero entre 1 e 20");
            }
        } while (n > 20 || n <= 0);

        int[] AG = new int[n];

        for (int i = 0; i < AG.length; i++){
            System.out.print("Entre com o valor " + ( i + 1 ) + ": ");

            AG[i] = sc.nextInt();

        }
        for (int i = 0; i < AG.length; i++) {
            for (int j = i + 1; j < AG.length; j++) {
                int contI = 0;
                for (int k = 1; k <= AG[i]; k++) {
                    if (AG[i] % k == 0) contI++;
                }
                boolean iEhPrimo = (contI == 2);

                int contJ = 0;
                for (int k = 1; k <= AG[j]; k++) {
                    if (AG[j] % k == 0) contJ++;
                }
                boolean jEhPrimo = (contJ == 2);
                if (iEhPrimo == true && jEhPrimo == true && AG[i] > AG[j]) {

                    int aux = AG[i];
                    AG[i] = AG[j];
                    AG[j] = aux;
                }
            }
        }
        System.out.println("\nprimos ordenados: ");
        for (int i = 0; i < AG.length; i++) {
            System.out.print(AG[i] + " ");
        }
    }
}
// -- Victor Hugo dos Santos -- //