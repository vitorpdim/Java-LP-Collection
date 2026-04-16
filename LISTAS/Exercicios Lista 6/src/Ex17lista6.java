import java.util.Scanner;

public class Ex17lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner leiaChar = new Scanner(System.in);

        int nota1, nota2, media, soma;
        String decidir = "";

        do {

        System.out.println("entre com a nota da 1a. prova: ");
        nota1 = sc.nextInt();

        System.out.println("entre com a nota da 2a. prova: ");
        nota2 = sc.nextInt();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10){
            System.out.println("As notas precisam ser entre 0 a 10!");
        }else {

            soma = nota1 + nota2;
            media = soma / 2;
            System.out.println("\nA media das notas é: " + media);
            System.out.println("NOVO CÁLCULO (S/N)?");
            decidir = leiaChar.nextLine();
        }
        }while(decidir.equals ("s") || decidir.equals ("S"));
    }
}

// -- Victor Hugo dos Santos -- //