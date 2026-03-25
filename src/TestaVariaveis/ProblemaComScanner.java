import java.util.Scanner;
public class ProblemaComScanner {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = "";
		int idade = 0;
		double altura = 0.0;
		System.out.println("Entre com seu nome: ");
		nome = sc.nextLine();
		System.out.println("Qual a sua idade: ");
		idade = sc.nextInt();
		System.out.println("Qual a sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println("\nNome: " + nome);
		System.out.println("\nIdade: " + idade);
		System.out.println("\nAltura: " + altura);
	}
}

