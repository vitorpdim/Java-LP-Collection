import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero:");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println(num1 + " e " + num2 + " são iguais");
        } else if (num1 > num2) {
            System.out.println(num1 + " é maior!");
        }else{
            System.out.println(num2 + " é maior!");
        }
    }
}

// Victor Hugo dos Santos