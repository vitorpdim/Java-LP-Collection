import java.util.Scanner;
    public class Ex11lista6 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            int contador, alunos, num, soma;
            double media;

            soma = 0;
            System.out.println("Digite a quantidade de alunos: ");
            alunos = leia.nextInt();
            contador = 1;

            while(contador <= alunos){
                System.out.print("Entre com um numero: ");
                num = leia.nextInt();

                soma += num;
                contador++;
            }
            media = soma/alunos;

            System.out.println("Notas: " + soma);
            System.out.println("Media: " + media);
        }
    }

// -- Victor Hugo dos Santos -- //