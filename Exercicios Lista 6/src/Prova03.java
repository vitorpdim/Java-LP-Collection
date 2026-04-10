import java.util.Scanner;
public class Prova03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c = a + b;
        int contador = 0, termos = 0, fibonacci = 0;

        do {

                System.out.println("Digite a quantidade de fracoes: ");
                fibonacci = sc.nextInt();
                if (fibonacci > 0){
                    String aux = "";
                    for (int i = 1; i <= fibonacci; i++){
                        a = b;
                        b = c;
                        c = a + b;

                        aux = a + " " + aux;
                    }
                    System.out.print(aux);
                    a = 0;
                    b = 1;
                    c = a + b;
                    aux = "";

                }else{
                    System.out.print("Valor Invalido fi");
                }
                if(fibonacci == 0){
                    System.out.print("Fim do programa");
                    break;
                }
            }while (true);
    }
}

// -- Victor Hugo dos Santos -- //