import java.util.Scanner;

public class Ex61lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int quantidade = 0;
        double resultado = 0;
        int numero = 2;
        String saida = "";

        do {
            System.out.print("entre com a quantidade de termos: ");
            quantidade = sc.nextInt();

            if (quantidade >= 1){
                numero = 2;
                resultado = 0;
                saida = "";

                for (int termo = 1; termo <= quantidade; termo++){

                    saida += " + " + numero + "/" + (numero - 1);
                    resultado += ((double) numero / (numero - 1));
                    numero += 2;
                }
                System.out.println("Resultado: " + saida + " = " + resultado + "\n");
            }
        }while(quantidade >=1 );
    }
}
