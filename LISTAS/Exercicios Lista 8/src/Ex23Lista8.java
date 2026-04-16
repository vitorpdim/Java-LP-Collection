import java.util.Scanner;
import java.util.Arrays;

public class Ex23Lista8 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int AD[] = new int[10];
        int pares = Integer.parseInt("");

        for (int i = 0; i < AD.length; i++){
            AD[i] = leia.nextInt();

        }

        for (int vetor : AD){
            if (vetor % 2 == 0){
                pares += Integer.parseInt(vetor + " ");
            }
        }
        System.out.println("pares");


        System.out.print(pares);

        System.out.println(" ");
        System.out.println("--------------------------------");

        System.out.println("ordenado");

        Arrays.sort(AD);
        System.out.print("                    " +  Arrays.toString(AD));

        String novoArray[] = new String[pares];

    }
}
// -- Victor Hugo dos Santos -- //