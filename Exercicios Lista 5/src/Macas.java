import java.util.Scanner;

public class Macas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira quantas macas voce gostaria de comprar: ");

        double valorMaca;
        int numMacas = sc.nextInt();
        double valorTotal;

        if (numMacas < 12 ){
            valorMaca = 1.30;
            valorTotal = valorMaca * numMacas;

            System.out.println("O valor total das suas macas é: R$" + valorTotal);
        }else{
            valorMaca = 1.00;
            valorTotal = valorMaca * numMacas;

            System.out.println("O valor total das suas macas é: R$" + valorTotal);
        }
    }
}

// Victor Hugo dos Santos