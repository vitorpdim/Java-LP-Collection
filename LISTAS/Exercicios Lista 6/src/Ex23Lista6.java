import java.util.Scanner;

public class Ex23Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, somaSalario = 0, maiorSalario = 0;
        int numFilhos, somaFilhos = 0, contHabitantes = 0, contSalarioMenor150 = 0;

        System.out.println("Pesquisa da Prefeitura (Digite salario negativo para sair)");

        do {
            System.out.print("Entre com o salario: ");
            salario = sc.nextDouble();


            if (salario < 0) {
                break;
            }

            System.out.print("Entre com o numero de filhos: ");
            numFilhos = sc.nextInt();

            contHabitantes++;
            somaSalario += salario;
            somaFilhos += numFilhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario < 150.00) {
                contSalarioMenor150++;
            }

            System.out.println("--- Proximo habitante ---");

        } while (true);

        if (contHabitantes > 0) {

            System.out.println("\n--- Resultados da Pesquisa ---");
            System.out.println("a) Media de salario: R$ " + (somaSalario / contHabitantes));
            System.out.println("b) Media de filhos: " + ((double) somaFilhos / contHabitantes));
            System.out.println("c) Maior salario: R$ " + maiorSalario);
            System.out.println("d) Percentual com salario menor que R$ 150,00: " + ((double) contSalarioMenor150 / contHabitantes * 100) + "%");

        } else {

            System.out.println("Nenhum dado foi inserido.");
        }
    }
}

// -- Victor Hugo dos Santos -- //