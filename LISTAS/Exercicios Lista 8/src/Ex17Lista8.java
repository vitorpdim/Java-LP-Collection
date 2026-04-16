import java.util.Random;
import java.util.Scanner;

public class Ex17Lista8 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();

        int n = 0;
        int contador = 0;

        System.out.println("Escreva o tamanho do primeiro elemento: ");
        do {
            n = leia.nextInt();

            if (n > 20){
                System.out.println("número inválido! escreva novamente");

            }

        } while (n > 20);


        int X[] = new int[n];
        for (int i = 0; i < n; i++){
            X[i] = aleatorio.nextInt(10);

            System.out.print(X[i] + " ");

            if (X[i] % 2 == 0){
                contador++;
            }
            else{

            }

        }

        System.out.println("Numeros primos: " + contador);


    }
}
// -- Victor Hugo dos Santos -- //