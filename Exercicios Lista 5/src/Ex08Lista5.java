import java.util.Scanner;

public class Ex08Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;

        System.out.print("Hora de inicio: ");
        inicio = sc.nextInt();

        System.out.print("Hora de fim: ");
        fim = sc.nextInt();

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }

        System.out.println("A duracao do jogo foi de " + duracao + " horas.");
    }
}

// -- Victor Hugo dos Santos -- //