public class OperadorCast {
public static void main(String[] args){
	byte b;
	int  i;
	
	i = 10;
	System.out.println("Int: " + i);
	
	// avisar perda de dados ao programa
	b = (byte)i;
	System.out.println("Byte: " + b);
	
  }
}
