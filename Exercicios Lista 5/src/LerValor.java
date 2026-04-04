import java.util.Scanner;

public class LerValor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 10 ){
            System.out.println("NÃO É MAIOR QUE 10!");
        }else {
            System.out.println("É MAIOR QUE 10!");
        }
    }
}

// Victor Hugo dos Santos