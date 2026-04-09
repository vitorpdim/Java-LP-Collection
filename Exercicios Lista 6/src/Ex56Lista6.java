public class Ex56Lista6 {
    public static void main(String[] args) {

        System.out.println("Numeros perfeitos entre 1 e 900:");

        for (int i = 1; i <= 900; i++) {
            int soma = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }

            if (soma == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// -- Victor Hugo dos Santos -- //