import java.util.Scanner;

public class Ex07lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, tabuada, produto;
        System.out.println("Digite um número entre 1 e 10");
        tabuada = sc.nextInt();
        if (tabuada >= 1 && tabuada <= 10 ) {

            for (num = 1; num <= 10; num++) {

                produto = tabuada * num;
                System.out.println(tabuada + " x " + num + " = " + produto);
            }
        }else{
            System.out.println("Não eh um numero entre 1 e 10");
        }

    }
}

// -- Victor Hugo dos Santos -- //