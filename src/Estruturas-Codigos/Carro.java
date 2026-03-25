import java.util.Scanner;

public class Carro {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner ( System.in );
		
		String opcao;
		
		System.out.println("=== MENU ===");
		System.out.println("P) Carro Popular");
		System.out.println("M) Carro Class Media");
		System.out.println("L) Carro Luxo");
		System.out.println("---------");
		System.out.println(">>> Opcao: ");
		opcao = leiaStr.nextLine().toUpperCase();
		
		switch( opcao ){
			case "L":
			System.out.println("Piloto automatico");
			System.out.println("Blindagem");
			
			case "M":
			System.out.println("ABS");
			System.out.println("Airbags");
			
			case "P":
			System.out.println("Chassis");
			System.out.println("Pneus");
			break;
			
			default:
				System.out.println("Opcao Invalida");
			
			}
		
	}
}

