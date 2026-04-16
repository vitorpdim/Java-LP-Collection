import java.util.Scanner;

public class Ex44lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, resultado = 1, cont = 1;
        System.out.println("Numero de termos para fatoriar: ");
        num = sc.nextInt();
                for(; cont <= num; cont++){
                    resultado *= cont;
                    System.out.printf("O resultado de %d eh: %d\n\n", cont, resultado);
                }
        }
    }

// -- Victor Hugo dos Santos -- //