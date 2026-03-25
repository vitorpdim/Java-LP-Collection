import java.util.Scanner;

public class VerificacaoTriangulo {
	
	public static void main (String[] args) {
			
			Scanner sc = new Scanner(System.in);
								
			System.out.println("DIGITE O VALOR DO LADO A");
			double ladoA = sc.nextDouble();
	
			System.out.println("DIGITE O VALOR DO LADO B");
			double ladoB = sc.nextDouble();
			
            System.out.println("DIGITE O VALOR DO LADO C");
			double ladoC = sc.nextDouble();
			
			
			sc.close();
			
			if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoC + ladoA > ladoB){
					
					if(ladoA == ladoB && ladoB == ladoC ){
						System.out.println("Os valores informadoos formam um triangulo EQUILATEROOOOOOOOOOOOO");
						
						}else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
								System.out.println("Os valores informadoos formam um triangulo ISOLECES");

							} else{
								System.out.println("Os valores informadoos formam um triangulo ESCALENO");
								}
					
				}else{
					
					System.out.println("Os valores informados não formam um triangulo");
					
					}

	}
}

