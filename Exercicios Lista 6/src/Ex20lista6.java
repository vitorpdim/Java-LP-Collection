import java.util.Scanner;

public class Ex20lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador, num;

        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        System.out.println("Digite 100 numeros: ");
        for(contador = 1; contador <= 100; contador++){

            num = sc.nextInt();
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }

        }
        System.out.println("maior: " + maior + "menor: " + menor);
    }
}

// -- Victor Hugo dos Santos -- //