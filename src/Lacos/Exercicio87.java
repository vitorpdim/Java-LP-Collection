import java.util.Scanner;

public class Exercicio87 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = 0, y = 0;
		
		System.out.print("Entre com o valor de x: ");
		x = sc.nextInt();
		
		do{
			if(x % 2 == 0){
				y = x / 2;
				}else{
					
					y = 3 * x + 1;
					
					}
					
					y = x;
					
					System.out.print( y + " ");
			
			 }while( y != 1 );
	}
}

