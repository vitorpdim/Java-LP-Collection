import java.util.Scanner;

public class TesteFibonacci {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a, b, c, termoInicial, termoFinal;

            String saida = " ";

            a = 0;
            b = 1;
            c = a + b;

            System.out.print("Entre com o termo inicial: ");
            termoInicial = sc.nextInt();

            System.out.print("Entre com o termo final: ");
            termoFinal = sc.nextInt();

            for(int termoAtual = 1; termoAtual <= termoFinal; termoAtual++){

                if (termoAtual >= termoInicial){

                    saida = a + " " + saida;
                }

                a = b;
                b = c;
                c = a + b;

            }
            System.out.print( saida );
        }
    }

// -- Victor Hugo dos Santos -- //
