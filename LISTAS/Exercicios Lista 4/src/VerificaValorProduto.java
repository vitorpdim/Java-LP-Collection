import java.util.Scanner;

public class VerificaValorProduto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int preco1, preco2;

        System.out.println("Informe o preco do produto 1: ");
        preco1 = leia.nextInt();

        if (preco1 >= 0 && preco1 <= 1000){
            System.out.println("Informe o preco do produto 2: " );
            preco2 = leia.nextInt();

            if(preco2 >= 1 && preco2 <= 100){
                if(preco1 < preco2){
                    System.out.println("Produto 1 eh o mais barato");
                }else{
                    if(preco2 < preco1){
                        System.out.println("Produto 2 eh o mais barato");
                    }else{
                        System.out.println("Os produtos tem o mesmo preco!");
                    }
                }

            }else {
                System.out.println("\n\tValor do produto 2 eh invalido!\n");
            }
        }else {
            System.out.println("\n\tValor do produto 1 eh invalido!");
        }
    }
}

// Victor Hugo dos Santos