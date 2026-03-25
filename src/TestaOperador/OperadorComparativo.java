import java.util.Scanner;
public class OperadorComparativo {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma idade para conferir se tu podes votar: ");
		int idade = sc.nextInt();
		System.out.println();
		
		if(idade >= 16 & idade < 18){
			System.out.println("Pode votar");
		}else if ( idade < 16 ){
			System.out.println("Nao pode votar");
		}else{
			System.out.println("Obrigado a votar");
		}
		sc.close();
	}
}

