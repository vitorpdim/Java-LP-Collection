import java.util.Scanner;

public class Ex07Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase = "";
        int contador = 0;

        System.out.print("Escreva uma palavra: ");
        frase = leia.nextLine();


        frase = frase.toLowerCase();



        for (char letra = 'a'; letra <= 'z'; letra++){

            contador = 0;

            for (int i = 0; i < frase.length(); i++){

                if (frase.charAt (i) == letra){
                    contador++;

                }
            }

            System.out.println( letra + ": " + contador);


        }
    }
}
// -- Victor Hugo dos Santos --