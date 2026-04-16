    import java.util.Scanner;

    public class Ex24Lista8 {
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

            int[] AE = new int[n];

            for (int i = 0; i < AE.length; i++){
                System.out.print("Entre com um numero: ");

                AE[i] = sc.nextInt();

            }
            for (int i = 0; i < AE.length; i++) {
                for (int j = i + 1; j < AE.length; j++) {

                    if (AE[i] % 2 != 0 && AE[j] % 2 != 0 && AE[i] < AE[j] ){
                        int aux = AE[i];
                        AE[i] = AE[j];
                        AE[j] = aux;
                    }
                }
            }
            System.out.println("\nimpares ordenados: ");
            for (int i = 0; i < AE.length; i++) {
                System.out.print(AE[i] + " ");
            }
        }
    }
// -- Victor Hugo dos Santos -- //