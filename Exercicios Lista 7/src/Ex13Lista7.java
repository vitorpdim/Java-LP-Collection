import java.util.Scanner;

public class Ex13Lista7 {
    public static void main(String [] args){
        Scanner leia = new  Scanner(System.in);

        String palavra = "";
        int contador = 0;

        System.out.println("Digite uma frase: ");
        palavra = leia.nextLine();

        palavra = palavra.toLowerCase();

        for (int i = 0; i< palavra.length(); i++){

            if (palavra.charAt (i) != 'a' && palavra.charAt (i) != 'e'
                    && palavra.charAt (i) != 'i' && palavra.charAt (i) != 'o'
                    && palavra.charAt (i) != 'u' &&  palavra.charAt (i) != ' ' ){

                contador++;
            }


        }

        System.out.println ("O número de consoantes são: " + contador);


    }
}
// -- Victor Hugo dos Santos --