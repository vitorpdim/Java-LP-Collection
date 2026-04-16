import java.util.Scanner;
public class Ex46lista6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont = 1;
        long resultado = 1L;
        System.out.print("Numero de termos para a sequencia de fatoriais: ");
        num = sc.nextInt();
        for(; cont<=num; cont++){
            resultado*=cont;
        }
        cont--;
        for(;cont>=1;--cont){
            System.out.printf("O resultado de %d! eh: %d\n\n", cont, resultado);
            resultado/=cont;
        }
    }
}
// -- Victor Hugo dos Santos -- //