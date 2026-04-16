import java.util.Scanner;

public class Ex23Lista7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome = "", sobrenome = "";

        System.out.print("Entre com um nome: ");
        nome = leia.nextLine();

        String[] palavras = nome.split(" ");

       /*  for (int indice = nome.length() -1 ; indice >= 0; indice--){
            if (nome.charAt(indice) == ' '){

                sobrenome = nome.substring(indice + 1);
                break;
                }
            }
            */

        System.out.println("sobrenome: " + palavras [palavras.length - 1]);
    }
}
// -- Victor Hugo dos Santos --