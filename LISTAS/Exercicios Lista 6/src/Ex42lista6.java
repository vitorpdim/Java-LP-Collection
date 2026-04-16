public class Ex42lista6 {
    public static void main (String[] args){

        int num = 1;
        int resultado = 1;
        int cont = 1;

        for(; num <= 10; num++){
            for (; cont <= num; cont++){
                resultado *= cont;
            }
            System.out.println("O fatorial de " + num + " é " + resultado);
        }

    }
}

// -- Victor Hugo dos Santos -- //