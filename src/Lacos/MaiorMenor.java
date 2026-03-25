import java.util.Scanner;

public class MaiorMenor {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		
		for( int contador = 1; contador >= 5; contador++){
				
			System.out.print( "Entre com um numero: " );
			contador = sc.nextInt();
			
			
			if (numero > maior ){
				maior = numero;
				}
				if( numero < menor){
					menor = numero;
					}
			
			}
			
			
	}
}

