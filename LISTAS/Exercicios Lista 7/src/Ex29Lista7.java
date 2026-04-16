import java.util.Scanner;

public class Ex29Lista7 {
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        String frase = "", saida = "";
        int escolher = 0;

        do {
            System.out.println("O que deseja fazer?" + "\n1 - Criptografar" +
                    "\n2 - Descriptografar" + "\n3 - sair");



            escolher = leia.nextInt();
            switch ( escolher ) {
                case 1, 2:

                    System.out.print("Entre com uma frase: ");
                    frase = leiaStr.nextLine();

                    saida = "";

                    for (int atual = 0; atual < frase.length(); atual++){

                        if (frase.charAt(atual) >= 'A' && frase.charAt(atual) <= 'M' ||
                                frase.charAt(atual) >= 'a' && frase.charAt(atual) <= 'm'){
                            saida += (char) (frase.charAt(atual) + 13);

                        }
                        else if (frase.charAt(atual) >= 'N' && frase.charAt(atual) <= 'Z' ||
                                frase.charAt(atual) >= 'n' && frase.charAt(atual) <= 'z'){
                            saida += (char) (frase.charAt(atual) - 13);

                        }
                        else {
                            saida += frase.charAt(atual);
                        }
                    }

                    System.out.println("\nSaida:" + saida);
                    System.out.println("========================\n");

                    break;


                case 3:
                    System.out.println("\n\tsistema finalizado\n");


                    break;


                default:
                    System.out.println("\n\tOpção inválida\n");

                    break;


            }

        } while ( escolher != 3);
    }
}
// -- Victor Hugo dos Santos --