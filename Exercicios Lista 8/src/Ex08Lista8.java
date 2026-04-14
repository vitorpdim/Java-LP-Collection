import java.util.Scanner;

public class Ex08Lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] f = new int[5];
        int soma = 0;
        boolean temImpar = false;

        for (int i = 0; i < f.length; i++){
            System.out.print("Entre com um numero: ");

            f[i] = sc.nextInt();
            if (f[i] % 2 != 0){
                soma += f[i];
                temImpar = true;
            }
        }
        if (temImpar == true) {
            System.out.println("\n\t\nsoma dos numeros impares: " + soma);
        }else{
            System.out.println("nao tem elementos impares!!");
        }
        System.out.println("Fim do programa!");
    }
}
// -- Victor Hugo dos Santos -- //