import java.util.Scanner;

public class Ex30Lista7 {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        String frase = "", saida = "";
        int opcao = 0;

        do {

            System.out.println("\n ====== ROT 13 ======");
            System.out.println("\n 1) Criptografar");
            System.out.println("\n 2) Descriptografar");
            System.out.println("\n 3) Sair");
            System.out.println("\n ------------");
            System.out.println(" OPCAO: ");
            opcao = leia.nextInt();

            switch (opcao) {

                case 1:
                case 2:
                    System.out.println("Entre com uma frase: ");
                    frase = leiaStr.nextLine();

                    saida = "";

                    for (int atual = 0; atual < frase.length(); atual++) {
                        if (frase.charAt(atual) >= 'A' && frase.charAt(atual) <= 'M' || frase.charAt(atual) >= 'a' && frase.charAt(atual) <= 'm') {
                            saida += (char)(frase.charAt(atual) + 13);
                        } else if ( frase.charAt(atual) >= 'N' && frase.charAt(atual) <= 'Z' || frase.charAt(atual) >= 'm' && frase.charAt(atual) <= 'z'){
                            saida += (char)(frase.charAt(atual) - 13);
                        }else{
                            saida += frase.charAt(atual);
                        }
                    }

                    System.out.println("\nSaida: " +saida);
                    break;

                case 3:
                    System.out.println("fechou o programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 3);
    }
}
// -- Victor Hugo dos Santos --