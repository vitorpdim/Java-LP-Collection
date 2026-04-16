import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Digite a nota: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("VALOR INVALIDO");
        } else {
            if (nota < 6) {
                System.out.println("REPROVADO");
            } else {
                System.out.println("APROVADO");
            }
        }
    }
}

// -- Victor Hugo dos Santos -- //