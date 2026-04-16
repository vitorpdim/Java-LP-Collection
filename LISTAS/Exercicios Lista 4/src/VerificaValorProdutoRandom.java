public class VerificaValorProdutoRandom {
    public static void main(String[] args) {
        int precoProduto1, precoProduto2;

        precoProduto1 = (int)(Math.random() * 1000 + 1);
        precoProduto2 = (int)(Math.random() * 1000 + 1);



        System.out.println();

        if (precoProduto1 < precoProduto2){
            System.out.println("Produto 1 eh mais barato!");
        }else {
             if(precoProduto2 < precoProduto1){
                 System.out.println("O produto 2 eh mais barato");

             } else {
                 System.out.println("Os preços são iguais");
             }
        }
    }
}

// Victor Hugo dos Santos