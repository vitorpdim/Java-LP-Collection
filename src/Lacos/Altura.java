import java.util.Scanner;

public class Altura {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner ( System.in );
		
		double altura = 0.0, soma = 0.0, media = 0.0;
		for(int contador = 1; contador <= 5; contador++){
			
			System.out.print("Entre com a sua altura: ");
			altura = leia.nextDouble();
			
			soma += altura;
			}
			
			media = soma / 5;
			
			System.out.println("Media: " + media);
	}
}

