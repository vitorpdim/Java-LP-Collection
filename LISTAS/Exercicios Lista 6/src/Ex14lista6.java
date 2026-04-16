import java.util.Scanner;

public class Ex14lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, num2, soma = 0;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = sc.nextInt();

        while (num <= num2) {


            soma += num;
            num++;
        }
        System.out.println("A soma dos inteiros é: " + soma);
    }
}

// -- Victor Hugo dos Santos -- //