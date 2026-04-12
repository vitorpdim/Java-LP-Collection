import java.util.Scanner;

public class Ex21Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase = "";

        System.out.print("Escreva uma palavra: ");
        frase = leia.nextLine();


        frase = frase.toLowerCase();



        for (int i = 0; i < frase.length(); i++){

            System.out.println(frase.charAt(i));
        }

    }
}
// -- Victor Hugo dos Santos --