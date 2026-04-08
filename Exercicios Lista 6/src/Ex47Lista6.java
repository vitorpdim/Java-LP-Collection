public class Ex47Lista6 {
    public static void main(String[] args) {

        System.out.println("Numeros primos entre 1 e 100:");

        for (int i = 1; i <= 100; i++) {
            int divisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //