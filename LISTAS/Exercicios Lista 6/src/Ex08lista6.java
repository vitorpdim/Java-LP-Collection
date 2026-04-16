import java.util.Scanner;

public class Ex08lista6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, negativos;
        negativos = 0;
        numero = 0;

        while(numero <= 10 ){
            System.out.println("Digite 10 numeros: ");
            numero = sc.nextInt();
            if (numero < 0){
                negativos++;
            }

        }
        System.out.println("A quantidade de numeros negativos é: " + negativos);
    }
}

// -- Victor Hugo dos Santos -- //