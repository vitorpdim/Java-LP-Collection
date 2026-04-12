public class Ex24Lista7 {
    public static void main(String[] args) {

        int tamanho = (int)(Math.random() * 40) + 1;
        int contador = 0;
        int maior = 0;

        String texto = "";
        for (int i = 1; i <= tamanho; i++){

            texto = texto + (int)(Math.random()*2);

        }
        System.out.println("Texto: " + texto);

        for (int i = 0; i < texto.length(); i++){

            if ( texto.charAt(i) == '1'){

                contador++;

            }else{
                contador = 0;
            }

            if ( contador > maior){
                maior = contador;
            }
        }
        System.out.println("Contador de '1' " + maior);
    }
}
// -- Victor Hugo dos Santos --