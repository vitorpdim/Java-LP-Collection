import java.util.Scanner;

public class Prova02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double conta, pessoas;
        double dez, valorind;
        int valor;

        System.out.print("Digite o valor da conta: ");
        conta = sc.nextDouble();

        System.out.print("Digite a quantidade de pessoas: ");
        pessoas = sc.nextDouble();

        System.out.print("Pagar 10% ao garçom: 1 (SIM) - 2 (NAO) ");
        valor = sc.nextInt();

        switch (valor){

            case 1:
                dez = conta * 0.10;
                conta += dez;
                valorind = conta / pessoas;
                System.out.println("Conta a ser paga: R$ " + conta);
                System.out.println("Dividida para: " + pessoas + " pessoas");
                System.out.println("Valor individual: R$ " + valorind);

                break;

            case 2:
                valorind = conta / pessoas;
                System.out.println("Conta a ser paga: R$ " + conta);
                System.out.println("Dividida para: " + pessoas + " pessoas");
                System.out.println("Valor individual: R$ " + valorind);
                break;
        }
    }
}

// -- Victor Hugo dos Santos -- //