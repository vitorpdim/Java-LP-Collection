import java.util.Scanner;
public class ArrayInverso {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int a[] = new int[5];		
		
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

