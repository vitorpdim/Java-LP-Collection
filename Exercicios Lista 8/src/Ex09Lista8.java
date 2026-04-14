import java.util.Scanner;

public class Ex09Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] g = new int[5];
        int pares = 0;

        for (int i = 0; i < g.length; i++){
            System.out.print("Entre com um numero: ");

            g[i] = sc.nextInt();
        }

        if(pares == 0){
            System.out.println("Nao tem elementos pares");
        }else{

            int[] h = new int[pares];

            for (int i = 0, j = 0; i < g.length; i++){
                if (g[i] % 2 == 0){

                    h[j] = g[i];

                    j++;
                }
            }

            for (int i = 0; i < h.length; i++){
                System.out.println("elementos pares: " + h[i] + " ");
            }
        }
        System.out.println("Fim do programa!");

    }
}
// -- Victor Hugo dos Santos -- //