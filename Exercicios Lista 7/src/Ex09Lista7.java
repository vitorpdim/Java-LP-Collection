import java.util.Scanner;

public class Ex09Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase = "";
        int contador = 0;

        System.out.println("Digite uma frase: ");
        frase = leia.nextLine();

        for (int i = 0; i < frase.length(); i++){

            if (frase.charAt(i) == ' '){
                contador++;


            }

        }
        System.out.print("A sua frase contem: " + contador + " espaÃ§os");


    }
}
// -- Victor Hugo dos Santos --