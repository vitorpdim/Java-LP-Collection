import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);

        String resposta = "";

        int hora = 0;

        System.out.println("Entrar com a hora ou gerar aleatória: [M/A] ");
        resposta = leiaStr.nextLine();

        if( resposta.equalsIgnoreCase ("M")){
            System.out.print("Informe a hora: ");
            hora = leia.nextInt();
        }else{
            hora = (int)(Math.random() * 24);
        }

        System.out.println("A hora informada foi: " + hora);

        if(hora >= 0 && hora < 24){
            // 0..6
            if(hora <= 6 ){
                System.out.println("Zzzz");
            }else{
                // 7..11
                if (hora <= 11){
                    System.out.println("Bom dia!!");

                } else{
                    // 12..17
                    if (hora <= 17){
                        System.out.println("Boa tarde!!");
                    }
                    // 18..23
                    else{
                        System.out.println("Boa noite");
                    }
                }
            }



        }else{
            System.out.println("\n\tHora invalida\n");
        }

    }
}

// Victor Hugo dos Santos