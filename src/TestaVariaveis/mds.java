public class mds {
	
	public static void main (String[] args) {
		
		boolean b = false;
		String s = (b = !b) ? (b = !b) ? "Oi" : "oi":(b = !b) ? "word" : "word";
		System.out.println(s);
		
	}
}

