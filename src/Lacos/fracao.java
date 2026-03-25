
public class fracao {
	
	public static void main (String[] args) {
		
		double H = 0.0;
		
		int numerador = 1, denominador = 1;
		System.out.print("H = ");
		for (numerador = 1; numerador <= 98; numerador += 2){
			
			System.out.print(numerador + "/" + denominador + " + ");
			H += (double)numerador / denominador;
			denominador++;
			}
		System.out.print(numerador + "/" + denominador);
		H += (double)numerador / denominador;
		System.out.println(" = " + H);
	}
}

