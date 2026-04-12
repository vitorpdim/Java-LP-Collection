import java.util.Scanner;

public class Ex28Lista7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frase para dobrar:");
        String entrada = sc.nextLine(), resultado = "";

        int inicio = 0;
        int fim = entrada.length() - 1;

        while (inicio < fim) {
            resultado = resultado + entrada.charAt(inicio) + entrada.charAt(fim);

            inicio++;
            fim--;
        }

        if (inicio == fim) {
            resultado = resultado + entrada.charAt(inicio);
        }

        System.out.println("Saída: " + resultado);

        sc.close();
    }
}
// -- Victor Hugo dos Santos --