import java.util.Scanner;

public class DesvioCondicionalSimples {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		System.out.println("Informe a idade");
		idade = sc.nextInt();
		
		if(idade >= 18){
			System.out.println("Pode ter cnh!!!!!!!!");
			}  else {
				System.out.println("Não pode ter cnh");
				}
	}
}

