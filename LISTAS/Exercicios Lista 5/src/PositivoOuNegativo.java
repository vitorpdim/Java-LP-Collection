import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0 ){
            System.out.println("negativo");
        }else {
            System.out.println("positivo");
        }
    }
}

// Victor Hugo dos Santos