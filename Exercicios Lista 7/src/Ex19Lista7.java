import java.util.Scanner;

public class Ex19Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leia.nextLine();

        palavra = palavra.toLowerCase();

        String invertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("NÃO é um palíndromo.");
        }

        leia.close();
    }
}
// -- Victor Hugo dos Santos --