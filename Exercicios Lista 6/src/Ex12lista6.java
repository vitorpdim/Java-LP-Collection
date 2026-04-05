import java.util.Scanner;

public class Ex12lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador, numero, soma;
        soma = 0;

        for(contador = 1; contador <= 10; contador++){

            System.out.println("Digite um numero: ");
            numero = sc.nextInt();

            soma += numero;
        }
        System.out.println("A soma dos valores são: " + soma);
    }
}

// -- Victor Hugo dos Santos -- //