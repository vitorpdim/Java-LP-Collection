import java.util.Scanner;

public class Ex17Lista7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase1 = "";
        String frase2 = "";
        int contadornumerico = 0;
        int contadoralfabetico = 0;

        int i = 0;
        int a = 0;

        System.out.println("Escreva duas frases palavra: ");

        System.out.print("Escreva a primeira: ");
        frase1 = leia.nextLine();

        System.out.print("Escreva a segunda: ");
        frase2 = leia.nextLine();




        frase1 = frase1.toLowerCase();

        frase2 = frase2.toLowerCase();


        for ( i = 0; i < frase1.length(); i++){


        }

        for ( a = 0; a < frase2.length(); a++){

        }


        if (frase1.equals(frase2)){
            System.out.println("frases iguais");

        }

        else {
            System.out.println("frases diferentes");

        }


    }
}
// -- Victor Hugo dos Santos --