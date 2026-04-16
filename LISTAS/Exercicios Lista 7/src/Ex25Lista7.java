import java.util.Scanner;

public class Ex25Lista7 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        String senha = "";
        String verificacao1 = "";
        String verificacao2 = "";
        String verificacao3 = "";
        String verificacao4 = "";

        int contadornumerico = 0;
        int contadoralfabetico = 0;
        int contadorsimbolos = 0;
        int contadortamanho = 0;



        do {
            System.out.print("Digite sua senha: ");
            senha = leia.nextLine();
            senha = senha.toLowerCase();

            for (int i = 0; i < senha.length(); i++) {
                System.out.println("Senha: " + senha.charAt(i));

                if (senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z') {
                    contadoralfabetico++;
                }

                if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
                    contadornumerico++;

                }
                if (senha.charAt(i) >= '%' && senha.charAt(i) <= '+') {
                    contadorsimbolos++;


                }

                if (senha.length() >= 10) {
                    verificacao1 = "ok";

                } else {
                    verificacao1 = "X";
                }

                if (contadoralfabetico >= 3) {
                    verificacao2 = "ok";

                } else {
                    verificacao2 = "X";
                }

                if (contadornumerico >= 3) {
                    verificacao3 = "ok";

                } else {
                    verificacao3 = "X";
                }

                if (contadorsimbolos >= 2) {
                    verificacao4 = "ok";

                } else {
                    verificacao4 = "X";
                }
            }


            System.out.println("Tamanha 10: " + senha.length() + "(" + verificacao1 + ")");
            System.out.println("Letras 3: " + contadoralfabetico + "(" + verificacao2 + ")");
            System.out.println("Números 3: " + contadornumerico + "(" + verificacao3 + ")");
            System.out.println("Símbolos 2: " + contadorsimbolos + "(" + verificacao4 + ")");



        } while ( senha.length() < 10 || contadoralfabetico < 3 || contadornumerico < 3
                || contadorsimbolos < 2 );

        System.out.print("Senha aprovada! Parabéns!");

    }
}

// -- Victor Hugo dos Santos --