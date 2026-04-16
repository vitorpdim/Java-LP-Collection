import java.util.Scanner;

 class Ex09lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador, numero, aux, fora;
        aux = 0;
        for (contador = 1; contador <= 10; contador ++){
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            if( numero >= 10 && numero <= 20) {

                aux++;
            }
        }
        fora = (contador - aux) - 1;
        System.out.println("numeros no intervalo de [10 e 20]: " + aux);
        System.out.println("numeros fora do intervalo: " + fora);
    }
}

// -- Victor Hugo dos Santos -- //