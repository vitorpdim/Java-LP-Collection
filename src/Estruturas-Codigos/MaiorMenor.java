import java.util.Scanner;

public class MaiorMenor {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 5 numeros para conferir o maior número");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int aux;
		
		
		if(a >= b  && a >= c && a >= d && a >= e){
			aux = a;
			} else if(b >= c && b >= d && b >= e){
				aux = b;
				}else if (c >= d && c >= e){
				aux = c;
				} else if (d >= e){
					aux = d;
					}else{
						aux = e;
						}
		int aux2 = 0;					
		if(a >= b  && a >= c && a >= d && a >= e){
			aux = a;
			} else if(b <= c && b <= d && b <= e){
				aux2 = b;
				}else if (c <= d && c <= e){
				aux2 = c;
				} else if (d <= e){
					aux2 = d;
					}else{
						aux2 = e;
						}
						
						
		System.out.println("O maior numero é: " + aux);
		System.out.println("O menor numero é: " + aux2);
					
			
		
		
		
	}
}

