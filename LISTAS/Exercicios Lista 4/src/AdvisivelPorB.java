import java.util.Scanner;

public class AdvisivelPorB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Entre com o calor de A: ");
        a = sc.nextInt();

        if (a >= 0 && a <= 100){
            System.out.println("Entre com o valor de B: ");
            b = sc.nextInt();
            if (b >= 1 && b <= 20 ){
                if (a >= b){
                    if (a % b == 0){
                        System.out.println("A eh divisivel por B.");
                    }else {
                        System.out.println("A naum eh divisivel por B.");
                    }
                } else {
                    System.out.println("\n\tValor unvalido para B.\n");
                }


            }else{
                System.out.println("\n\tValor invalido para b.\n");
            }
        }
    }
}

// Victor Hugo dos Santos