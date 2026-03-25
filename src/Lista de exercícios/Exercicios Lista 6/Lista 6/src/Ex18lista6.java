import java.util.Scanner;

public class Ex18lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total, i;
        double media, valor, valorTot = 0.0;

        System.out.print("Digite a quantidade de produtos em estoque: ");
        total = sc.nextInt();

        for (i = 1; i <= total; i++){
            System.out.print("Digite o valor de todos os produtos: ");
            valor = sc.nextDouble();
            valorTot += valor;
        }
        media = valorTot / total;
        System.out.println("O valor em estoque é: " + valorTot);
        System.out.println("A media dos valores é: " + media);
        sc.close();
    }
}

// -- Victor Hugo dos Santos -- //