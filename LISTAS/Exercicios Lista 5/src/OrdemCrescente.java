import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero:");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println(num1 + " e " + num2 + " são iguais");
        } else if (num1 < num2) {
            System.out.println(num1 + " - " + num2);
        }else{
            System.out.println(num2 + " - " + num1);
        }
    }
}

// Victor Hugo dos Santos