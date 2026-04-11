import java.util.Scanner;

public class Ex06Lista7 {
    public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);

        String frase = "", letra = "";

        int contador = 0;

        System.out.print("Entre com uma frase: ");
        frase = leiaStr.nextLine();

        do {
            System.out.print("Entre com uma letra: ");
            letra = leiaStr.nextLine();

           if (letra.length() != 1 || (letra.toLowerCase().charAt(0) < 'a' || letra.toLowerCase().charAt(0) > 'z') ){
                System.out.println("\nEntre apenas com uma unica letra");
            }
        }while(letra.length() != 1 || (letra.toLowerCase().charAt(0) < 'a' || letra.toLowerCase().charAt(0) > 'z') );


        for (int i = 0; i < frase.length(); i++){
            if (("" + frase.charAt(i)).equalsIgnoreCase(letra)){
                contador++;
            }
        }

        System.out.println("Quantidade de " + letra + ": " + contador);
    }
}
// -- Victor Hugo dos Santos --