public class fracoesDim {
	
	public static void main (String[] args) {
		
		double resultado = 0.0;
		
		int numerador = 2, denominador = 500, termos = 10;
		System.out.print("resultado = ");
		for (int contador = 1; contador <= termos; contador += 2){
			
			
			if( contador % 2==1 ){
				numerador = 2;
				System.out.print(" + " + numerador + "/" + denominador);
				resultado += (double)numerador / denominador;
				} else{
				numerador = 5;
				System.out.print(" - " + numerador + "/" + denominador);
				resultado -= (double)numerador / denominador;
					}
				
				
				denominador -= 50;
			
			}

		System.out.println(" = " + resultado);
	}
}

