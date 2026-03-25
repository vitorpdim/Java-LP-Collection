import java.util.Scanner;

public class Ex05lista6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        do{
            System.out.println("Digite um valor maior que 0 para N: ");
            num = sc.nextInt();
        }while(num <= 0);

        for (int i = 0; i <= num; i++){
            System.out.println(i);
        }

        sc.close();
    }
}

// -- Victor Hugo dos Santos -- //