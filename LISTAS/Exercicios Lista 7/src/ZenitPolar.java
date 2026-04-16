import java.util.Scanner;

public class ZenitPolar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase = "", saida = "";

        System.out.print("Entre com uyma frase: ");
        frase = leia.nextLine();

        // Z E N I T
        // P O L A R

        String zenit = "zenitpolae";
        String polar = "polarzenit";
        boolean achei = false;

        for (int i = 0; i < frase.length(); i++){
            achei = false;
            for (int z = 0; z < zenit.length(); z++) {
                if (frase.charAt(i) == zenit.charAt(z)){

                    saida += polar.charAt(z);
                    achei = true;
                }
            }
            if (!achei){

                    saida += frase.charAt(i);

            }
        }
        System.out.println("Saida" + saida);
    }
}

// -- Victor Hugo dos Santos --