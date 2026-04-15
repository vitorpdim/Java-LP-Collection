import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex27Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] AH = new int[(int) (Math.random() * 15) + 1];
        int max = 5, min = 2;
        boolean encontrouDisgraca = false;

        for (int i = 0; i < AH.length; i++) {
            do {
                System.out.print("Entre com o elementos do Array: ");
                AH[i] = sc.nextInt();
                if (AH[i] < 25) {
                    System.out.print("\nERRO!! o elemento precisa ser maior ou igual a 25!\n");
                }
            } while (AH[i] < 25);
        }

        int[] AI = new int[(int) (Math.random() * (max - min + 1)) + min];

        for (int i = 0; i < AI.length; i++) {
            AI[i] = (int) (Math.random() * (100 - 26 + 1)) + 26;
        }

        for (int i = 0; i <= AH.length - AI.length; i++) {

            boolean match = true;
            for (int j = 0; j < AI.length; j++) {
                if (AH[i + j] != AI[j]) {
                    match = false;
                    break;
                }
            }
            if (match == true) {
                System.out.println(i);
                encontrouDisgraca = true;
            }
        }

        if (encontrouDisgraca == false){
            System.out.println("ERRO NENHUMA COISA ENCONTRADA");
        }
    }
}

// -- Victor Hugo dos Santos -- //