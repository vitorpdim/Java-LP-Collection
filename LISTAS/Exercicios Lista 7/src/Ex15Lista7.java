import java.util.Scanner;

public class Ex15Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine();

        boolean temNumero = false;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                temNumero = true;
                break;
            }
        }

        if (temNumero) {
            System.out.println("A frase contém caracteres numéricos.");
        } else {
            System.out.println("A frase NÃO contém caracteres numéricos.");
        }

        leia.close();
    }
}
// -- Victor Hugo dos Santos --