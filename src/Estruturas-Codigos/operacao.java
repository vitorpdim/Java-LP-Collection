import java.util.Scanner;

public class operacao {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		Scanner scStr = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("escolha o primeiro numero: ");
		System.out.println("");
		num1 = sc.nextInt();
		System.out.println("");
		int resultado = 0;
		System.out.println("escolha a operacao: ");
		System.out.println("");
		String operacao = scStr.nextLine();
		char operacao2;
		operacao2 = operacao.charAt(0);
		System.out.println("");
		System.out.println("escolha o segundo numero: ");
		System.out.println("");
		num2 = sc.nextInt();
		System.out.println("");
		
		
	
		
		switch(operacao2){
			
			case '+':
			resultado = num1 + num2;
			System.out.println("");
			System.out.println(" " + num1 + " " + operacao + " " + num2 + " = " + resultado );

			break;
				
			case '-':
			resultado = num1 - num2;
			System.out.println("");
			System.out.println(" " + num1 + " " + operacao + " " + num2 + " = " + resultado );

			break;
			
			case '*':
			resultado = num1 * num2;
			System.out.println("");
			System.out.println(" " + num1 + " " + operacao + " " + num2 + " = " + resultado );

			break;
			
			case '/':
			resultado = num1 / num2;
			System.out.println("");
			System.out.println(" " + num1 + " " + operacao + " " + num2 + " = " + resultado );
			break;
			
			default:
			System.out.println("Operacao Invalida!!");
			
			
			}
			
			

	}
}

