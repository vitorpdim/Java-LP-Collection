import java.util.Scanner;

public class Ex20Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limite = 20, temp;
        int[] aa = new int[(int)(Math.random()*limite) + 1 ];

        System.out.print("AA: ");

        for (int i = 0; i < aa.length; i++){
            aa[i] = (int)(Math.random()*10);

            System.out.print(aa + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < aa.length; i++){
            for (int j = 0; j < aa.length; i++){

                if (aa[i] > aa[j]){
                    temp = aa[i];
                    aa[i] = aa[j];
                    aa[j] = temp;
                }
            }
        }
        System.out.print("AA ORDENADO: ");

        for (int i = 0; i < aa.length; i++){
            aa[i] = (int)(Math.random()*10);

            System.out.print(aa + " ");
        }
    }
}
// -- Victor Hugo dos Santos -- //