import java.util.Scanner;

public class Ex24Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Tabuadas de 0 a 10 ---");


        for (int i = 0; i <= 10; i++) {
            System.out.println("\nTabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}

// -- Victor Hugo dos Santos -- //