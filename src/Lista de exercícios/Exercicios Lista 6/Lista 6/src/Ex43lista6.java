import java.util.Scanner;

public class Ex43lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, resultado, cont, vez = 1;
        for ( ; vez <= 7; vez++){
            resultado = 1;
            cont = 1;

            System.out.print("Digite o numero para fatoriar: " );
            num = sc.nextInt();

            for(; cont <= num; cont++){
                resultado *= cont;

            }
            System.out.printf("O resultado de %d! eh: %d\n\n", num, resultado);
        }
    }
}

// -- Victor Hugo dos Santos -- //