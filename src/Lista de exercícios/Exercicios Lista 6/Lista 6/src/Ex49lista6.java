import java.util.Scanner;

public class Ex49lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int quantidade = 0, numero = 1, contador = 0;
        String saida;

        do{
            System.out.print("Entre com a quantidade de termos da sequencia de primos: ");
            quantidade = sc.nextInt();


            if (quantidade > 0){

                saida = " ";
                numero = 1;
                for (int termo = 1; termo <= quantidade; ){

                    contador = 0;

                    for (int i = 1; i <= numero; i++){

                        if (numero %i == 0){
                            contador++;
                        }
                    }if (contador == 2){

                        saida = numero + " " + saida;
                        termo++;
                    }
                    numero++;
                }
                System.out.println(saida);
            }
        }while(quantidade > 0);
        System.out.println("\n\n\tFim do programa");
    }
}
