import java.util.Scanner;

public class Ex11Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase = "";
        int contadornumerico = 0;
        int contadoralfabetico = 0;

        System.out.print("Escreva uma palavra: ");
        frase = leia.nextLine();


        frase = frase.toLowerCase();



        for (int i = 0; i < frase.length(); i++){

            if (frase.charAt (i) >= 'a' && frase.charAt (i) <= 'z'){
                contadoralfabetico++;
            }

            if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9'){
                contadornumerico++;
            }
        }

        System.out.println("A quantidade de letras são: " + contadoralfabetico);
        System.out.println("A quantidade de digitos são: " + contadornumerico);
    }
}
// -- Victor Hugo dos Santos --