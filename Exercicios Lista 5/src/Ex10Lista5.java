import java.util.Scanner;

public class Ex10Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioFixo, valorVendas, comissao, salarioTotal;

        System.out.print("Digite o salario fixo: ");
        salarioFixo = sc.nextDouble();

        System.out.print("Digite o valor das vendas: ");
        valorVendas = sc.nextDouble();

        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
        }

        salarioTotal = salarioFixo + comissao;

        System.out.println("Salario Total: R$ " + salarioTotal);
    }
}

// -- Victor Hugo dos Santos -- //