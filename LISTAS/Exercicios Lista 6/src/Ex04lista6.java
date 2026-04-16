import java.util.Scanner;

public class Ex04lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num >= 0) {
            for (int i = 0; i <= num; i++)
                System.out.println(i);
        }
    }
}

// -- Victor Hugo dos Santos -- //