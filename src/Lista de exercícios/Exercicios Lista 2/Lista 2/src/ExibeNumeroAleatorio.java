import java.util.Random;

public class ExibeNumeroAleatorio {

    public static void main(String[] args) {
        Random random = new Random();
        double interval = 101;
        double numeroAleatorio = random.nextDouble(interval);
        System.out.println(numeroAleatorio);
    }
}
