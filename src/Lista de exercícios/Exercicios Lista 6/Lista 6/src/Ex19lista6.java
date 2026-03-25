import java.util.Scanner;

public class Ex19lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        int total = 0;
        String decidir;
        double media, valor, valorTot = 0.0;

        do {
            System.out.print("Digite o valor de todos os produtos: ");
            valor = sc.nextDouble();
            valorTot += valor;
            System.out.println("MERCADORIAS (S/N)?");
            decidir = scString.nextLine();
            total++;

        }while(decidir.equals ("s") ||  decidir.equals("S") );
        media = valorTot / total;
        System.out.println("O valor em estoque é: " + valorTot);
        System.out.println("A media dos valores é: " + media);
        sc.close();
    }
}

// -- Victor Hugo dos Santos -- //