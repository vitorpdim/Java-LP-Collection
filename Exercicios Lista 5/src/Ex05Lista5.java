import java.util.Scanner;

public class Ex05Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual, anoNasc, idade;

        System.out.print("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        anoNasc = sc.nextInt();

        idade = anoAtual - anoNasc;

        if (idade >= 16) {
            System.out.println("Voce podera votar este ano.");
        } else {
            System.out.println("Voce nao podera votar este ano.");
        }
    }
}

// -- Victor Hugo dos Santos -- //