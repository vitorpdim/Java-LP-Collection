import java.util.Scanner;

public class centenario {
	
	public static void main (String[] args) {
			
		Scanner sc = new scanner(System.in);
		
		int numero = 0;
		
		if( numero != 0){
		do{
		System.out.print("Entre com um numero de 4 digitos: ");
		numero = leia.nextInt();
		
		if(numero <1000 || numero > 9999){
			System.out.println("\n\tNumero invalido! tem que ter 4 digitos")
			}else{
				
				numero /= 100;
				if (numero % 4 == 0){
					System.out.println(" Milhares e centenas  formam um multiplo de 4.")
					}
				}
		}
	  } while( numero != 0 && (numero < 1000 || numero > 9999));
	}
}

