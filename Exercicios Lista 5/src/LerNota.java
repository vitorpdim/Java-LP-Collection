import java.util.Scanner;

public class LerNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        int PrimNota = sc.nextInt();
        System.out.println();
        System.out.println("Insira a segunda nota: ");
        System.out.println();
        int SegNota = sc.nextInt();

        int media = ((PrimNota + SegNota)) / 2;

        System.out.println();
        System.out.println("Sua média foi: " + media);
        System.out.println();
        if (media >= 6){
            System.out.println("aprovado!!!!!");
        }else{
            System.out.println("reprovadokkkkkkkkk");
        }

    }
}

// Victor Hugo dos Santos