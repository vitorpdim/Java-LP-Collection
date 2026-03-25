public class Ex53lista6 {
    public static void main(String[] args) {

        int a = 0, b = 1, c = a + b;
        while(a  <= 250){

            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;

        }
    }
}
