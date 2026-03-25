import java.util.Scanner;


public class UltimoDiaDoMes {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int mes;
		
		System.out.print("Entre com o número do mes: ");
		mes = leia.nextInt();
		
		switch(mes){
			
			case 2:
				System.out.println("28 Dias");
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 Dias");
				break;
				
			case 1:
			case 3:
			case 5:
			case 8:
			case 10:
			case 12:
				System.out.println("31 Dias");
				break;
				
		
		
		}
	}
}

