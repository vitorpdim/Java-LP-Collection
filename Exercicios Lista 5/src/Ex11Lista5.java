import java.util.Scanner;

public class Ex11Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado = 0;
        String entradaOp;
        char operacao;

        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextDouble();

        System.out.print("Digite a operacao (+, -, *, /): ");
        entradaOp = sc.next();
        operacao = entradaOp.charAt(0);

        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisao por zero.");
            }
        } else {
            System.out.println("Operacao invalida.");
        }
    }
}

// -- Victor Hugo dos Santos -- //