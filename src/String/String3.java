import java.util.Scanner;

public class String3 {
	
	public static void main (String[] args) {
		
		Scanner scString = new Scanner(System.in);
		
		String frase = "", novaFrase = "";
		char letra, novaLetra = 'a';
		
		System.out.print("Entre com uma frase: ");
		frase = scString.nextLine();
		
		System.out.print("Entre com uma letra: ");
		letra = scString.nextLine().charAt(0);
		
		System.out.print("Entre com uma nova letra: ");
		novaLetra = scString.nextLine().charAt(0);
		
		int contador = 0;
		
		for(int i = 0; i < frase.length(); i++){
			//System.out.println(frase.charAt(i));
			
			if(frase.charAt(i) == letra){
				
				novaFrase += novaLetra;
				contador++;
				}else{
					novaFrase += frase.charAt(i);
					}
		}
		System.out.println("\nNova Frase: " + novaFrase);
		System.out.println("\nQuantidade de " + letra + ": " + contador);
		
	}
}
