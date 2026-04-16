import java.util.Scanner;
import java.util.Arrays;

public class Ex19Lista8 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int Z[] = new int[10];

        System.out.println("coloque 10 numeros: ");
        for (int i = 0; i < Z.length; i++){
            Z[i] = leia.nextInt();
        }

        System.out.println("Os 10 numeros em odem crescente: ");

        for(int res : Z){
            System.out.print(res);

        }

        Arrays.sort(Z);
        System.out.print("                    " +  Arrays.toString(Z));

    }

}
// -- Victor Hugo dos Santos -- //