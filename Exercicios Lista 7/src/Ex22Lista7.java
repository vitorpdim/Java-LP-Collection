import java.util.Scanner;

public class Ex22Lista7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = "", palavra = "";

        int contador = 0;

        System.out.println("Entre com uma frase: ");
        frase= sc.nextLine();

        System.out.println("Entre com uma palavra: ");
        palavra = sc.nextLine();

        String[] saida = frase.split(palavra);

        for (int i = 0; i < saida.length; i++ ){
            System.out.println(saida [i]);

        }

        System.out.println("ocorrencias: " + saida.length);
    }
}
// -- Victor Hugo dos Santos --