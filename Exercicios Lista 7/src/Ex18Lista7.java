import java.util.Scanner;

public class Ex18Lista7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com uma cadeia: ");
        String cadeia = sc.nextLine();
        boolean ehBinario = true;

        for (int i = 0; i < cadeia.length(); i++){

            if (cadeia.charAt( i ) != '0' && cadeia.charAt( i ) != '1'){
                ehBinario = false;
                break;
            }
        }
        if (cadeia.length() == 8 && ehBinario == true){
                System.out.println("eh binario!!!");
        }else {
            System.out.println("nao eh binario!!!");
        }
    }
}
// -- Victor Hugo dos Santos --