import java.util.Scanner;
public class QuantidadeDeIndices {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int a[];
		int tamanho = 0;	
		
		do{
			
		System.out.print("Quantos numeros ce quer digitar: ");
		tamanho = leia.nextInt();
		
		if( tamanho <= 0){
			System.out.print("Entre com um numero maior que zero!");
			}
		
		}while(tamanho <=0);
		
		a = new int[tamanho];	
		
		for ( int i = 0; i < a.length; i++){
		System.out.print("Entre com um numero: ");
		a[i] = leia.nextInt();	
			}
			System.out.print("\nVoce digitou: ");
			
			for ( int i = 0; i < a.length; i++){
		System.out.print( a[i] + " ");
			}
			
			System.out.print("\nO inverso: ");
			
			for ( int i = a.length - 1; i >= 0; i--){
				System.out.print( a[i] + " ");
			}
	}
}

