import java.util.Scanner;

public class Ex10lista6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador, num, soma;
        double media;

        soma = 0;

        for(contador = 1; contador <= 10; contador++){
            System.out.print("Entre com um numero: ");
            num = leia.nextInt();

            soma += num;
        }
        media = soma/10.0;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}

// -- Victor Hugo dos Santos -- //