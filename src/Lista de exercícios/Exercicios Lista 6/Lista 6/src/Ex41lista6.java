import java.util.Scanner;

public class Ex41lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, resultado = 1, contador;

        System.out.print("Digite um numero pra fatoriar: ");
        num = sc.nextInt();

        for(contador = 1; contador <= num; contador++){
            resultado *= contador;
        }
        System.out.print("O resultado de " + num + " é: " + resultado   );
    }
}

// -- Victor Hugo dos Santos -- //