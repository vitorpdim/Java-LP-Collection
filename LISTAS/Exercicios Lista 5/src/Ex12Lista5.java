import java.util.Scanner;

public class Ex12Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco, valorFrete, valorFinal;
        int codigo;
        String procedencia;

        System.out.print("Digite o preco do produto: ");
        preco = sc.nextDouble();

        System.out.print("Digite o codigo de origem: ");
        codigo = sc.nextInt();

        if (codigo == 1) {
            procedencia = "Norte";
            valorFrete = preco * 0.10;
        } else if (codigo == 2 || codigo == 5 || codigo == 9) {
            procedencia = "Sul";
            valorFrete = preco * 0.03;
        } else if (codigo == 3 || (codigo >= 10 && codigo <= 15)) {
            procedencia = "Leste";
            valorFrete = preco * 0.012;
        } else if (codigo == 7 || codigo == 20) {
            procedencia = "Oeste";
            valorFrete = preco * 0.073;
        } else {
            procedencia = "Importado";
            valorFrete = preco * 0.222;
        }

        valorFinal = preco + valorFrete;

        System.out.println("\n--- Detalhes ---");
        System.out.println("Preco base: R$ " + preco);
        System.out.println("Procedencia: " + procedencia);
        System.out.println("Frete: R$ " + valorFrete);
        System.out.println("Valor Final: R$ " + valorFinal);
    }
}

// -- Victor Hugo dos Santos -- //