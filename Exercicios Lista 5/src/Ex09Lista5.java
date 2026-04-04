import java.util.Scanner;

public class Ex09Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasTrabalhadas;
        double salarioHora, salarioTotal, valorExtra;

        System.out.print("Numero de horas trabalhadas no mes: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Valor do salario por hora: ");
        salarioHora = sc.nextDouble();

        if (horasTrabalhadas > 160) {
            valorExtra = (horasTrabalhadas - 160) * (salarioHora * 1.5);
            salarioTotal = (160 * salarioHora) + valorExtra;
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        System.out.println("O salario total e: R$ " + salarioTotal);
    }
}

// -- Victor Hugo dos Santos -- //