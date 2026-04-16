import java.sql.SQLOutput;

public class Ex26Lista7 {
    public static void main(String[] args) {

        String texto = "", vogais = "aeiou", alfabeto = "";
        int contador, maior;

        for (int i = 'a'; i <= 'z'; i++){
            alfabeto += (char)i;
        }


        for (int i = 1; i <= 100; i++) {
            texto += (char) ('a' + Math.random() * 26);
        }
        System.out.println(texto);

        for (int letra = 'a'; letra <= 'z'; letra++){
            contador = 0;
            for (int i = 0; i < texto.length(); i++){

                if (letra == texto.charAt(i)){
                    contador++;
                }
            }

            if (contador == 0){
                System.out.println("As letras que faltam são: " + (char) letra + " ");
            }
        }
        System.out.println();

        System.out.println("A maior sequencia de letras repetidas");

        maior = 0;
        for (int letra = 'a'; letra <= 'z'; letra++){
            contador = 0;
            for (int i = 0; i < texto.length(); i++){
                if (letra == texto.charAt( i )){
                    contador++;
                }else {
                    contador = 0;
                }

                if (contador > maior){
                    maior = contador;
                }
            }
        }

        System.out.println(">>>>> " + maior);

        System.out.println("\nA maior sequencia de vogais");

        maior = 0;

        for (int letra = 0; letra < vogais.length(); letra++){
            contador = 0;

            for (int i = 0; i < texto.length(); i++){

                if (vogais.charAt(letra ) == texto.charAt( i )){

                    contador++;

                }else {

                    contador = 0;

                }

                if (contador > maior){
                    maior = contador;
                }
            }
        }
        System.out.println(">>>>> " + maior);

        System.out.println("\nA maior sequencia alfabetica");

        maior = 0;

        for (int letra = 0; letra < alfabeto.length(); letra++){
            contador = 0;

            for (int i = 0; i < texto.length(); i++){

                if (alfabeto.charAt(letra ) == texto.charAt( i )){

                    contador++;

                }else {

                    contador = 0;

                }

                if (contador > maior){
                    maior = contador;
                }
            }
        }
        System.out.println(">>>>> " + maior);
    }
}
// -- Victor Hugo dos Santos --