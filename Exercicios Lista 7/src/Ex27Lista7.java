import java.util.Scanner;

public class Ex27Lista7{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase1 = "";
        String frase2 = "";

        System.out.print("Escreva a primeira palavra: ");
        frase1 = leia.nextLine();


        System.out.print("Escreva a segunda palavra: ");
        frase2 = leia.nextLine();


        frase1 = frase1.toLowerCase();
        frase2 = frase2.toLowerCase();




        System.out.println("Entrada 1: " + frase1);
        System.out.println("Entrada 2: " + frase2);

        if (frase1.length() == frase2.length()){
            String soma = "";

            for (int i = 0; i < frase1.length(); i++){
                soma += "" + frase1.charAt(i) + frase2.charAt(i);

            }

            System.out.println("SaÃ­da" + soma);
        }

        else {
            System.out.println("Entradas de tamanhos diferentes.");

        }

    }
}
// -- Victor Hugo dos Santos --