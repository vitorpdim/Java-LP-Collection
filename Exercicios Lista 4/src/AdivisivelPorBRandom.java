public class AdivisivelPorBRandom {
    public static void main(String[] args) {

        int a = (int)(Math.random() * 1001);
        int b = (int)(Math.random() * 21);

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        if (b != 0 && a % b == 0) {
            System.out.println("É divisível");
        } else {
            System.out.println("Não é divisível");
        }
    }
}

// -- Victor Hugo dos Santos -- //