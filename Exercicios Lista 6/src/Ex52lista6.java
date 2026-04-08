import java.util.Scanner;

public class Ex52lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b= 1, c = a + b, numSolicit;
        boolean encont = false;

        System.out.print("entre com um numero inteiro: ");
        numSolicit = sc.nextInt();

        if (numSolicit >= 0){
           if(numSolicit == 0 || numSolicit == 1 ) {
               encont = true;
           }else {
               while (c <= numSolicit) {
                   if (c == numSolicit) {
                       encont = true;
                       break;

               }
               a = b;
               b = c;
               c = a + b;

               }
            }
            if (encont){
                System.out.println("\nPertence a sequencia de fibonacci!");

            }else{
                System.out.println("Nao pertence a sequencia de fibonacci");
            }

        }
    }
}

// -- Victor Hugo dos Santos -- //